/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.puppyadoption

import com.example.androiddevchallenge.R

object PuppyAdoptionRepository {

    fun loadDummyPuppyList(): List<PuppyItem> {
        return createDummyPuppyList()
    }

    fun loadDummyPuppyDetails(id: Int): PuppyItem {
        return createDummyPuppyList().filter { it.id == id }.first()
    }

    private fun createDummyPuppyList(): List<PuppyItem> {

        val puppyItem1 = PuppyItem(
            id = 1,
            name = "Affenpinscher",
            group = "Companion Dogs",
            height = "9 to 11 inches tall at the shoulder",
            weight = "7 to 9 pounds",
            lifeSpan = "12 to 14 years",
            description = "Dogs of the Affenpinscher breed were originally created to act as ratters in homes, stables, and shops. Bred down in size, they moved up in the world, becoming ladies’ companions. Today, they are happy, mischievous companion dogs.\n" +
                "\n" +
                "Although these are purebred dogs, you may still find them in shelters and rescues. Remember to adopt! Don’t shop if you want to bring a dog home.",
            imageId = R.drawable.affenpinscher
        )

        val puppyItem2 = PuppyItem(
            id = 2,
            name = "American English Coonhound",
            group = "Hound Dogs",
            height = "23 to 26 inches tall at the shoulder",
            weight = "NA",
            lifeSpan = "10 to 12 years",
            description = "A descendent of the English Foxhound, the American English Coonhoound is a hunting dog breed known for their speed, endurance, and loud voice in the field. The’ll bark and bay at home, too, making them a poor choice if you’ve got nearby neighbors. They need lots of exercise.\n" +
                "\n" +
                "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home.",
            imageId = R.drawable.american_english_coonhound
        )

        val puppyItem3 = PuppyItem(
            id = 3,
            name = "Beagle",
            group = "Hound Dogs",
            height = "13 to 15 inches tall at the shoulder",
            weight = "18 to 30 pounds",
            lifeSpan = "10 to 15 years",
            description = "Small, compact, and hardy, Beagles are active companions for kids and adults alike. Canines of this dog breed are merry and fun loving, but being hounds, they can also be stubborn and require patient, creative training techniques.\n" +
                "\n" +
                "Their noses guide them through life, and they’re never happier than when following an interesting scent. Beagles originally were bred as scenthounds to track small game, mostly rabbits and hare. They’re still used for this purpose in many countries today, including the United States. But you’ll find plenty of these pups living as companion dogs and loving, furry family members.",
            imageId = R.drawable.beagle
        )

        val puppyItem4 = PuppyItem(
            id = 4,
            name = "Chinook",
            group = "Working Dogs",
            height = "21 to 27 inches tall at the shoulder",
            weight = "55 to 70 pounds",
            lifeSpan = "12 to 15 years",
            description = "Created in the White Mountains of New Hampshire, the Chinook dog breed made its name on Admiral Byrd’s first Antarctic expedition in 1928. These days they’re multipurpose dogs who are happy hiking, competing in agility and other dog sports, pulling a sled or other conveyance, and playing with the kids.\n" +
                "\n" +
                "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home.",
            imageId = R.drawable.chinook
        )

        val puppyItem5 = PuppyItem(
            id = 5,
            name = "Corman Shepherd",
            group = "Mixed Breed Dogs",
            height = "12 to 15 inches",
            weight = "20 to 70 pounds",
            lifeSpan = "10 to 15 years",
            description = "The Corman Shepherd is a mixed breed dog — a cross between the Corgi and the German Shepherd Dog breeds. Loyal, courageous, and a bit stubborn, these pups inherited some of the best qualities from both of their parents.\n" +
                "\n" +
                "Corman Shepherds go by several names, including the German Corgi and the Corgi German Shepherd. Despite their unfortunate status as a designer breed, you may find these adorable dogs in shelters and rescues. So remember to adopt! Don’t shop!",
            imageId = R.drawable.corman_shepherd
        )

        val puppyItem6 = PuppyItem(
            id = 6,
            name = "German Shepherd Dog",
            group = "Herding Dogs",
            height = "1 foot, 10 inches to 2 feet, 2 inches tall at the shoulder",
            weight = "75 to 95 pounds",
            lifeSpan = "10 to 14 years",
            description = "The German Shepherd Dog is one of America’s most popular dog breeds — for good reasons. They’re intelligent and capable working dogs. Their devotion and courage are unmatched. And they’re amazingly versatile.\n" +
                "\n" +
                "The breed also goes by the name Alsatian. Despite their purebred status, you may find German Shepherds in shelters and breed specific rescues. So remember to adopt! Don’t shop if this is the breed for you.",
            imageId = R.drawable.german_shepherd
        )

        val puppyItem7 = PuppyItem(
            id = 7,
            name = "Yorkshire Terrier",
            group = "Companion Dogs",
            height = "8 to 9 inches tall at the shoulder",
            weight = "4 to 6 pounds",
            lifeSpan = "12 to 15 years",
            description = "Small in size but big in personality, the Yorkshire Terrier makes a feisty but loving companion. The most popular toy dog breed in the United States, the “Yorkie” has won many fans with their devotion to their owners, their elegant looks, and their suitability to apartment living.\n" +
                "\n" +
                "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home.",
            imageId = R.drawable.yorkshire_terrier
        )

        val puppyItem8 = PuppyItem(
            id = 8,
            name = "Shorkie",
            group = "Mixed Breed Dogs",
            height = "6 to 14 inches",
            weight = "5 to 15 pound",
            lifeSpan = "11 to 16 years",
            description = "The Shorkie is a mixed breed dog — a cross between the Shih Tzu and Yorkshire Terrier dog breeds. Small, fierce, and loyal, these pups inherited some of the best qualities from both of their parents.\n" +
                "\n" +
                "Shorkies also go by the names Shorkie Tzu, Yorkie Tzu, and Shih Tzu-Yorkie mix. Despite their unfortunate status as a designer breed, you may find these mixed breed dogs in shelters and rescues, so remember to adopt! Don’t shop!",
            imageId = R.drawable.shorkie
        )

        val puppyItem9 = PuppyItem(
            id = 9,
            name = "Weimaraner",
            group = "Sporting Dogs",
            height = "23 to 27 inches tall at the shoulder",
            weight = "55 to 85 pounds",
            lifeSpan = "11 to 13 years",
            description = "Originally bred as a gundog to handle big game like deer and bear, the Weimaraner, or “Silver Ghost,” was a highly sought-after dog breed in their native Germany. Today, these elegant but demanding dogs can still be found out on the hunting grounds. However, they can also make fine family friends if they get enough exercise.\n" +
                "\n" +
                "Although they’re purebred dogs, you may find Weimaraners in shelters or in the care of rescue groups. If this is the breed for you, opt to adopt if possible!",
            imageId = R.drawable.weimaraner
        )

        val puppyItem10 = PuppyItem(
            id = 10,
            name = "Weimaraner1",
            group = "Sporting Dogs",
            height = "23 to 32 inches tall at the shoulder",
            weight = "55 to 85 pounds",
            lifeSpan = "11 to 13 years",
            description = "Originally bred as a gundog to handle big game like deer and bear, the Weimaraner, or “Silver Ghost,” was a highly sought-after dog breed in their native Germany. Today, these elegant but demanding dogs can still be found out on the hunting grounds. However, they can also make fine family friends if they get enough exercise.\n" +
                "\n" +
                "Although they’re purebred dogs, you may find Weimaraners in shelters or in the care of rescue groups. If this is the breed for you, opt to adopt if possible!",
            imageId = R.drawable.yorkshire_terrier
        )

        val puppyItem11 = PuppyItem(
            id = 11,
            name = "American English Coonhound1",
            group = "Hound Dogs",
            height = "23 to 26 inches tall at the shoulder",
            weight = "NA",
            lifeSpan = "10 to 12 years",
            description = "A descendent of the English Foxhound, the American English Coonhoound is a hunting dog breed known for their speed, endurance, and loud voice in the field. The’ll bark and bay at home, too, making them a poor choice if you’ve got nearby neighbors. They need lots of exercise.\n" +
                "\n" +
                "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home.",
            imageId = R.drawable.american_english_coonhound
        )

        return arrayListOf(puppyItem1, puppyItem2, puppyItem3, puppyItem4, puppyItem5, puppyItem6, puppyItem7, puppyItem8, puppyItem9, puppyItem10, puppyItem11)
    }
}
