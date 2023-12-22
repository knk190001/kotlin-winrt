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

@ABIMarker(InjectedInputTouchInfo.ABI::class)
@Signature("rc(Windows.UI.Input.Preview.Injection.InjectedInputTouchInfo;{224fd1df-43e8-5ef5-510a-69ca8c9b4c28})")
@WinRTByReference(brClass = InjectedInputTouchInfo.ByReference::class)
public class InjectedInputTouchInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInjectedInputTouchInfo.WithDefault, IWinRTObject {
  private val __2145423842_Interface: IInjectedInputTouchInfo.WithDefault by lazy {
    as_2145423842()
  }


  public override val __2145423842_Ptr: JNAPointer? by lazy {
    __2145423842_Interface.__2145423842_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2145423842_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2145423842(): IInjectedInputTouchInfo.WithDefault {
    if(pointer == NULL) {
      return(IInjectedInputTouchInfo.ABI.makeIInjectedInputTouchInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInjectedInputTouchInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInjectedInputTouchInfo.ABI.makeIInjectedInputTouchInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InjectedInputTouchInfo> {
    public override fun getValue() = InjectedInputTouchInfo(pointer.getPointer(0))

    public fun setValue(value: InjectedInputTouchInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InjectedInputTouchInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InjectedInputTouchInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InjectedInputTouchInfo {
      val address = segment.toRawLongValue()
      return InjectedInputTouchInfo(Pointer(address))
    }

    public override fun toNative(obj: InjectedInputTouchInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
