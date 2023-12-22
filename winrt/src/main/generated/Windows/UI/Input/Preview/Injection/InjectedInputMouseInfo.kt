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

@ABIMarker(InjectedInputMouseInfo.ABI::class)
@Signature("rc(Windows.UI.Input.Preview.Injection.InjectedInputMouseInfo;{96f56e6b-e47a-5cf4-418d-8a5fb9670c7d})")
@WinRTByReference(brClass = InjectedInputMouseInfo.ByReference::class)
public class InjectedInputMouseInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInjectedInputMouseInfo.WithDefault, IWinRTObject {
  private val __1922848636_Interface: IInjectedInputMouseInfo.WithDefault by lazy {
    as_1922848636()
  }


  public override val __1922848636_Ptr: JNAPointer? by lazy {
    __1922848636_Interface.__1922848636_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1922848636_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1922848636(): IInjectedInputMouseInfo.WithDefault {
    if(pointer == NULL) {
      return(IInjectedInputMouseInfo.ABI.makeIInjectedInputMouseInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInjectedInputMouseInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInjectedInputMouseInfo.ABI.makeIInjectedInputMouseInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InjectedInputMouseInfo> {
    public override fun getValue() = InjectedInputMouseInfo(pointer.getPointer(0))

    public fun setValue(value: InjectedInputMouseInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InjectedInputMouseInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InjectedInputMouseInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InjectedInputMouseInfo {
      val address = segment.toRawLongValue()
      return InjectedInputMouseInfo(Pointer(address))
    }

    public override fun toNative(obj: InjectedInputMouseInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
