package Windows.ApplicationModel.DataTransfer

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(StandardDataFormats.ABI::class)
@WinRTByReference(brClass = StandardDataFormats.ByReference::class)
public class StandardDataFormats(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StandardDataFormats> {
    public override fun getValue() = StandardDataFormats(pointer.getPointer(0))

    public fun setValue(value: StandardDataFormats): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StandardDataFormats, MemoryAddress> {
    public val IStandardDataFormatsStatics3_Instance: IStandardDataFormatsStatics3 by lazy {
      createIStandardDataFormatsStatics3()
    }


    public val IStandardDataFormatsStatics2_Instance: IStandardDataFormatsStatics2 by lazy {
      createIStandardDataFormatsStatics2()
    }


    public val IStandardDataFormatsStatics_Instance: IStandardDataFormatsStatics by lazy {
      createIStandardDataFormatsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStandardDataFormatsStatics3(): IStandardDataFormatsStatics3 {
      val refiid = Guid.REFIID(IStandardDataFormatsStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.StandardDataFormats".toHandle(),refiid,interfacePtr)
      val result =
          IStandardDataFormatsStatics3.ABI.makeIStandardDataFormatsStatics3(interfacePtr.value)
      return result
    }

    public fun createIStandardDataFormatsStatics2(): IStandardDataFormatsStatics2 {
      val refiid = Guid.REFIID(IStandardDataFormatsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.StandardDataFormats".toHandle(),refiid,interfacePtr)
      val result =
          IStandardDataFormatsStatics2.ABI.makeIStandardDataFormatsStatics2(interfacePtr.value)
      return result
    }

    public fun createIStandardDataFormatsStatics(): IStandardDataFormatsStatics {
      val refiid = Guid.REFIID(IStandardDataFormatsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.StandardDataFormats".toHandle(),refiid,interfacePtr)
      val result =
          IStandardDataFormatsStatics.ABI.makeIStandardDataFormatsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StandardDataFormats {
      val address = segment.toRawLongValue()
      return StandardDataFormats(Pointer(address))
    }

    public override fun toNative(obj: StandardDataFormats): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UserActivityJsonArray() =
        ABI.IStandardDataFormatsStatics3_Instance.get_UserActivityJsonArray()

    public fun get_WebLink() = ABI.IStandardDataFormatsStatics2_Instance.get_WebLink()

    public fun get_ApplicationLink() =
        ABI.IStandardDataFormatsStatics2_Instance.get_ApplicationLink()

    public fun get_Text() = ABI.IStandardDataFormatsStatics_Instance.get_Text()

    public fun get_Uri() = ABI.IStandardDataFormatsStatics_Instance.get_Uri()

    public fun get_Html() = ABI.IStandardDataFormatsStatics_Instance.get_Html()

    public fun get_Rtf() = ABI.IStandardDataFormatsStatics_Instance.get_Rtf()

    public fun get_Bitmap() = ABI.IStandardDataFormatsStatics_Instance.get_Bitmap()

    public fun get_StorageItems() = ABI.IStandardDataFormatsStatics_Instance.get_StorageItems()
  }
}
