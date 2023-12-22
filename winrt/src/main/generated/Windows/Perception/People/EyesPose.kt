package Windows.Perception.People

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(EyesPose.ABI::class)
@Signature("rc(Windows.Perception.People.EyesPose;{682a9b23-8a1e-5b86-a060-906ffacb62a4})")
@WinRTByReference(brClass = EyesPose.ByReference::class)
public class EyesPose(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEyesPose.WithDefault, IWinRTObject {
  private val __696646895_Interface: IEyesPose.WithDefault by lazy {
    as_696646895()
  }


  public override val __696646895_Ptr: JNAPointer? by lazy {
    __696646895_Interface.__696646895_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__696646895_Interface)

  private fun as_696646895(): IEyesPose.WithDefault {
    if(pointer == NULL) {
      return(IEyesPose.ABI.makeIEyesPose(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEyesPose>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEyesPose.ABI.makeIEyesPose(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EyesPose> {
    public override fun getValue() = EyesPose(pointer.getPointer(0))

    public fun setValue(value: EyesPose): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EyesPose, MemoryAddress> {
    public val IEyesPoseStatics_Instance: IEyesPoseStatics by lazy {
      createIEyesPoseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEyesPoseStatics(): IEyesPoseStatics {
      val refiid = Guid.REFIID(IEyesPoseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.People.EyesPose".toHandle(),refiid,interfacePtr)
      val result = IEyesPoseStatics.ABI.makeIEyesPoseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EyesPose {
      val address = segment.toRawLongValue()
      return EyesPose(Pointer(address))
    }

    public override fun toNative(obj: EyesPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IEyesPoseStatics_Instance.IsSupported()

    public fun RequestAccessAsync() = ABI.IEyesPoseStatics_Instance.RequestAccessAsync()
  }
}
