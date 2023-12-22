package Windows.UI.Input.Preview.Injection

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

@ABIMarker(InjectedInputPenInfo.ABI::class)
@Signature("rc(Windows.UI.Input.Preview.Injection.InjectedInputPenInfo;{6b40ad03-ca1e-5527-7e02-2828540bb1d4})")
@WinRTByReference(brClass = InjectedInputPenInfo.ByReference::class)
public class InjectedInputPenInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInjectedInputPenInfo.WithDefault, IWinRTObject {
  private val __78246712_Interface: IInjectedInputPenInfo.WithDefault by lazy {
    as_78246712()
  }


  public override val __78246712_Ptr: JNAPointer? by lazy {
    __78246712_Interface.__78246712_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__78246712_Interface)

  public constructor() : this(ABI.activate())

  private fun as_78246712(): IInjectedInputPenInfo.WithDefault {
    if(pointer == NULL) {
      return(IInjectedInputPenInfo.ABI.makeIInjectedInputPenInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInjectedInputPenInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInjectedInputPenInfo.ABI.makeIInjectedInputPenInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InjectedInputPenInfo> {
    public override fun getValue() = InjectedInputPenInfo(pointer.getPointer(0))

    public fun setValue(value: InjectedInputPenInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InjectedInputPenInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InjectedInputPenInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InjectedInputPenInfo {
      val address = segment.toRawLongValue()
      return InjectedInputPenInfo(Pointer(address))
    }

    public override fun toNative(obj: InjectedInputPenInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
