package Windows.UI.Xaml.Hosting

import Windows.Foundation.Rect
import Windows.UI.Xaml.Hosting.IXamlSourceFocusNavigationRequestFactory.ABI.IID
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

@ABIMarker(XamlSourceFocusNavigationRequest.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.XamlSourceFocusNavigationRequest;{fbb93bb5-1496-5a80-ac00-e757359755e6})")
@WinRTByReference(brClass = XamlSourceFocusNavigationRequest.ByReference::class)
public class XamlSourceFocusNavigationRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlSourceFocusNavigationRequest.WithDefault, IWinRTObject {
  private val __1344267756_Interface: IXamlSourceFocusNavigationRequest.WithDefault by lazy {
    as_1344267756()
  }


  public override val __1344267756_Ptr: JNAPointer? by lazy {
    __1344267756_Interface.__1344267756_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1344267756_Interface)

  public constructor(reason: XamlSourceFocusNavigationReason) : this(ABI.activate(reason))

  public constructor(reason: XamlSourceFocusNavigationReason, hintRect: Rect) :
      this(ABI.activate(reason, hintRect))

  public constructor(
    reason: XamlSourceFocusNavigationReason,
    hintRect: Rect,
    correlationId: Guid.GUID
  ) : this(ABI.activate(reason, hintRect, correlationId))

  private fun as_1344267756(): IXamlSourceFocusNavigationRequest.WithDefault {
    if(pointer == NULL) {
      return(IXamlSourceFocusNavigationRequest.ABI.makeIXamlSourceFocusNavigationRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlSourceFocusNavigationRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlSourceFocusNavigationRequest.ABI.makeIXamlSourceFocusNavigationRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlSourceFocusNavigationRequest> {
    public override fun getValue() = XamlSourceFocusNavigationRequest(pointer.getPointer(0))

    public fun setValue(value: XamlSourceFocusNavigationRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlSourceFocusNavigationRequest, MemoryAddress> {
    public val IXamlSourceFocusNavigationRequestFactory_Instance:
        IXamlSourceFocusNavigationRequestFactory by lazy {
      createIXamlSourceFocusNavigationRequestFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlSourceFocusNavigationRequestFactory():
        IXamlSourceFocusNavigationRequestFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.XamlSourceFocusNavigationRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXamlSourceFocusNavigationRequestFactory.ABI.makeIXamlSourceFocusNavigationRequestFactory(factoryActivatorPtr.value))
    }

    public fun activate(reason: XamlSourceFocusNavigationReason): JNAPointer? =
        IXamlSourceFocusNavigationRequestFactory_Instance.CreateInstance(reason)?.pointer

    public fun activate(reason: XamlSourceFocusNavigationReason, hintRect: Rect): JNAPointer? =
        IXamlSourceFocusNavigationRequestFactory_Instance.CreateInstanceWithHintRect(reason,
        hintRect)?.pointer

    public fun activate(
      reason: XamlSourceFocusNavigationReason,
      hintRect: Rect,
      correlationId: Guid.GUID
    ): JNAPointer? =
        IXamlSourceFocusNavigationRequestFactory_Instance.CreateInstanceWithHintRectAndCorrelationId(reason,
        hintRect, correlationId)?.pointer

    public override fun fromNative(segment: MemoryAddress): XamlSourceFocusNavigationRequest {
      val address = segment.toRawLongValue()
      return XamlSourceFocusNavigationRequest(Pointer(address))
    }

    public override fun toNative(obj: XamlSourceFocusNavigationRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
