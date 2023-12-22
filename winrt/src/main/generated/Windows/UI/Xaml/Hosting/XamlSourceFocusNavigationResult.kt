package Windows.UI.Xaml.Hosting

import Windows.UI.Xaml.Hosting.IXamlSourceFocusNavigationResultFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XamlSourceFocusNavigationResult.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.XamlSourceFocusNavigationResult;{88d55a5f-9603-5d8f-9cc7-d1c4070d9801})")
@WinRTByReference(brClass = XamlSourceFocusNavigationResult.ByReference::class)
public class XamlSourceFocusNavigationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlSourceFocusNavigationResult.WithDefault, IWinRTObject {
  private val __233671392_Interface: IXamlSourceFocusNavigationResult.WithDefault by lazy {
    as_233671392()
  }


  public override val __233671392_Ptr: JNAPointer? by lazy {
    __233671392_Interface.__233671392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__233671392_Interface)

  public constructor(focusMoved: Boolean) : this(ABI.activate(focusMoved))

  private fun as_233671392(): IXamlSourceFocusNavigationResult.WithDefault {
    if(pointer == NULL) {
      return(IXamlSourceFocusNavigationResult.ABI.makeIXamlSourceFocusNavigationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlSourceFocusNavigationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlSourceFocusNavigationResult.ABI.makeIXamlSourceFocusNavigationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlSourceFocusNavigationResult> {
    public override fun getValue() = XamlSourceFocusNavigationResult(pointer.getPointer(0))

    public fun setValue(value: XamlSourceFocusNavigationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlSourceFocusNavigationResult, MemoryAddress> {
    public val IXamlSourceFocusNavigationResultFactory_Instance:
        IXamlSourceFocusNavigationResultFactory by lazy {
      createIXamlSourceFocusNavigationResultFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlSourceFocusNavigationResultFactory():
        IXamlSourceFocusNavigationResultFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.XamlSourceFocusNavigationResult".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXamlSourceFocusNavigationResultFactory.ABI.makeIXamlSourceFocusNavigationResultFactory(factoryActivatorPtr.value))
    }

    public fun activate(focusMoved: Boolean): JNAPointer? =
        IXamlSourceFocusNavigationResultFactory_Instance.CreateInstance(focusMoved)?.pointer

    public override fun fromNative(segment: MemoryAddress): XamlSourceFocusNavigationResult {
      val address = segment.toRawLongValue()
      return XamlSourceFocusNavigationResult(Pointer(address))
    }

    public override fun toNative(obj: XamlSourceFocusNavigationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
