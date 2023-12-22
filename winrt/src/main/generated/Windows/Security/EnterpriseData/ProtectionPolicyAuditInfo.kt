package Windows.Security.EnterpriseData

import Windows.Security.EnterpriseData.IProtectionPolicyAuditInfoFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProtectionPolicyAuditInfo.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectionPolicyAuditInfo;{425ab7e4-feb7-44fc-b3bb-c3c4d7ecbebb})")
@WinRTByReference(brClass = ProtectionPolicyAuditInfo.ByReference::class)
public class ProtectionPolicyAuditInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectionPolicyAuditInfo.WithDefault, IWinRTObject {
  private val __115251395_Interface: IProtectionPolicyAuditInfo.WithDefault by lazy {
    as_115251395()
  }


  public override val __115251395_Ptr: JNAPointer? by lazy {
    __115251395_Interface.__115251395_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__115251395_Interface)

  public constructor(
    action: ProtectionPolicyAuditAction,
    dataDescription: String,
    sourceDescription: String,
    targetDescription: String
  ) : this(ABI.activate(action, dataDescription, sourceDescription, targetDescription))

  public constructor(action: ProtectionPolicyAuditAction, dataDescription: String) :
      this(ABI.activate(action, dataDescription))

  private fun as_115251395(): IProtectionPolicyAuditInfo.WithDefault {
    if(pointer == NULL) {
      return(IProtectionPolicyAuditInfo.ABI.makeIProtectionPolicyAuditInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectionPolicyAuditInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectionPolicyAuditInfo.ABI.makeIProtectionPolicyAuditInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectionPolicyAuditInfo> {
    public override fun getValue() = ProtectionPolicyAuditInfo(pointer.getPointer(0))

    public fun setValue(value: ProtectionPolicyAuditInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectionPolicyAuditInfo, MemoryAddress> {
    public val IProtectionPolicyAuditInfoFactory_Instance: IProtectionPolicyAuditInfoFactory by
        lazy {
      createIProtectionPolicyAuditInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProtectionPolicyAuditInfoFactory(): IProtectionPolicyAuditInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.ProtectionPolicyAuditInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProtectionPolicyAuditInfoFactory.ABI.makeIProtectionPolicyAuditInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      action: ProtectionPolicyAuditAction,
      dataDescription: String,
      sourceDescription: String,
      targetDescription: String
    ): JNAPointer? = IProtectionPolicyAuditInfoFactory_Instance.Create(action, dataDescription,
        sourceDescription, targetDescription)?.pointer

    public fun activate(action: ProtectionPolicyAuditAction, dataDescription: String): JNAPointer? =
        IProtectionPolicyAuditInfoFactory_Instance.CreateWithActionAndDataDescription(action,
        dataDescription)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProtectionPolicyAuditInfo {
      val address = segment.toRawLongValue()
      return ProtectionPolicyAuditInfo(Pointer(address))
    }

    public override fun toNative(obj: ProtectionPolicyAuditInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
