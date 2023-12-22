package Windows.Services.Maps.LocalSearch

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LocalCategories.ABI::class)
@WinRTByReference(brClass = LocalCategories.ByReference::class)
public class LocalCategories(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LocalCategories> {
    public override fun getValue() = LocalCategories(pointer.getPointer(0))

    public fun setValue(value: LocalCategories): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalCategories, MemoryAddress> {
    public val ILocalCategoriesStatics_Instance: ILocalCategoriesStatics by lazy {
      createILocalCategoriesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILocalCategoriesStatics(): ILocalCategoriesStatics {
      val refiid = Guid.REFIID(ILocalCategoriesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.LocalSearch.LocalCategories".toHandle(),refiid,interfacePtr)
      val result = ILocalCategoriesStatics.ABI.makeILocalCategoriesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LocalCategories {
      val address = segment.toRawLongValue()
      return LocalCategories(Pointer(address))
    }

    public override fun toNative(obj: LocalCategories): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BankAndCreditUnions() =
        ABI.ILocalCategoriesStatics_Instance.get_BankAndCreditUnions()

    public fun get_EatDrink() = ABI.ILocalCategoriesStatics_Instance.get_EatDrink()

    public fun get_Hospitals() = ABI.ILocalCategoriesStatics_Instance.get_Hospitals()

    public fun get_HotelsAndMotels() = ABI.ILocalCategoriesStatics_Instance.get_HotelsAndMotels()

    public fun get_All() = ABI.ILocalCategoriesStatics_Instance.get_All()

    public fun get_Parking() = ABI.ILocalCategoriesStatics_Instance.get_Parking()

    public fun get_SeeDo() = ABI.ILocalCategoriesStatics_Instance.get_SeeDo()

    public fun get_Shop() = ABI.ILocalCategoriesStatics_Instance.get_Shop()
  }
}
