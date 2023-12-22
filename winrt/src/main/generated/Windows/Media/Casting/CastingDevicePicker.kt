package Windows.Media.Casting

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(CastingDevicePicker.ABI::class)
@Signature("rc(Windows.Media.Casting.CastingDevicePicker;{dcd39924-0591-49be-aacb-4b82ee756a95})")
@WinRTByReference(brClass = CastingDevicePicker.ByReference::class)
public class CastingDevicePicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICastingDevicePicker.WithDefault, IWinRTObject {
  private val __1482967028_Interface: ICastingDevicePicker.WithDefault by lazy {
    as_1482967028()
  }


  public override val __1482967028_Ptr: JNAPointer? by lazy {
    __1482967028_Interface.__1482967028_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1482967028_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1482967028(): ICastingDevicePicker.WithDefault {
    if(pointer == NULL) {
      return(ICastingDevicePicker.ABI.makeICastingDevicePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICastingDevicePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICastingDevicePicker.ABI.makeICastingDevicePicker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CastingDevicePicker> {
    public override fun getValue() = CastingDevicePicker(pointer.getPointer(0))

    public fun setValue(value: CastingDevicePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CastingDevicePicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Casting.CastingDevicePicker".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): CastingDevicePicker {
      val address = segment.toRawLongValue()
      return CastingDevicePicker(Pointer(address))
    }

    public override fun toNative(obj: CastingDevicePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
