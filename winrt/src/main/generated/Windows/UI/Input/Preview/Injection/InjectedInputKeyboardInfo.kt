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

@ABIMarker(InjectedInputKeyboardInfo.ABI::class)
@Signature("rc(Windows.UI.Input.Preview.Injection.InjectedInputKeyboardInfo;{4b46d140-2b6a-5ffa-7eae-bd077b052acd})")
@WinRTByReference(brClass = InjectedInputKeyboardInfo.ByReference::class)
public class InjectedInputKeyboardInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInjectedInputKeyboardInfo.WithDefault, IWinRTObject {
  private val __1012376060_Interface: IInjectedInputKeyboardInfo.WithDefault by lazy {
    as_1012376060()
  }


  public override val __1012376060_Ptr: JNAPointer? by lazy {
    __1012376060_Interface.__1012376060_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1012376060_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1012376060(): IInjectedInputKeyboardInfo.WithDefault {
    if(pointer == NULL) {
      return(IInjectedInputKeyboardInfo.ABI.makeIInjectedInputKeyboardInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInjectedInputKeyboardInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInjectedInputKeyboardInfo.ABI.makeIInjectedInputKeyboardInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InjectedInputKeyboardInfo> {
    public override fun getValue() = InjectedInputKeyboardInfo(pointer.getPointer(0))

    public fun setValue(value: InjectedInputKeyboardInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InjectedInputKeyboardInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InjectedInputKeyboardInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InjectedInputKeyboardInfo {
      val address = segment.toRawLongValue()
      return InjectedInputKeyboardInfo(Pointer(address))
    }

    public override fun toNative(obj: InjectedInputKeyboardInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
