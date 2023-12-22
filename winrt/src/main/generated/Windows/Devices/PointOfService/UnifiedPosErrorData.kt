package Windows.Devices.PointOfService

import Windows.Devices.PointOfService.IUnifiedPosErrorDataFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UnifiedPosErrorData.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.UnifiedPosErrorData;{2b998c3a-555c-4889-8ed8-c599bb3a712a})")
@WinRTByReference(brClass = UnifiedPosErrorData.ByReference::class)
public class UnifiedPosErrorData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUnifiedPosErrorData.WithDefault, IWinRTObject {
  private val __1139143441_Interface: IUnifiedPosErrorData.WithDefault by lazy {
    as_1139143441()
  }


  public override val __1139143441_Ptr: JNAPointer? by lazy {
    __1139143441_Interface.__1139143441_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1139143441_Interface)

  public constructor(
    message: String,
    severity: UnifiedPosErrorSeverity,
    reason: UnifiedPosErrorReason,
    extendedReason: WinDef.UINT
  ) : this(ABI.activate(message, severity, reason, extendedReason))

  private fun as_1139143441(): IUnifiedPosErrorData.WithDefault {
    if(pointer == NULL) {
      return(IUnifiedPosErrorData.ABI.makeIUnifiedPosErrorData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUnifiedPosErrorData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUnifiedPosErrorData.ABI.makeIUnifiedPosErrorData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UnifiedPosErrorData> {
    public override fun getValue() = UnifiedPosErrorData(pointer.getPointer(0))

    public fun setValue(value: UnifiedPosErrorData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UnifiedPosErrorData, MemoryAddress> {
    public val IUnifiedPosErrorDataFactory_Instance: IUnifiedPosErrorDataFactory by lazy {
      createIUnifiedPosErrorDataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUnifiedPosErrorDataFactory(): IUnifiedPosErrorDataFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.UnifiedPosErrorData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUnifiedPosErrorDataFactory.ABI.makeIUnifiedPosErrorDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      message: String,
      severity: UnifiedPosErrorSeverity,
      reason: UnifiedPosErrorReason,
      extendedReason: WinDef.UINT
    ): JNAPointer? = IUnifiedPosErrorDataFactory_Instance.CreateInstance(message, severity, reason,
        extendedReason)?.pointer

    public override fun fromNative(segment: MemoryAddress): UnifiedPosErrorData {
      val address = segment.toRawLongValue()
      return UnifiedPosErrorData(Pointer(address))
    }

    public override fun toNative(obj: UnifiedPosErrorData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
