package Windows.Management.Deployment

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

@ABIMarker(SharedPackageContainerManager.ABI::class)
@Signature("rc(Windows.Management.Deployment.SharedPackageContainerManager;{be353068-1ef7-5ac8-ab3f-0b9f612f0274})")
@WinRTByReference(brClass = SharedPackageContainerManager.ByReference::class)
public class SharedPackageContainerManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISharedPackageContainerManager.WithDefault, IWinRTObject {
  private val __1605325737_Interface: ISharedPackageContainerManager.WithDefault by lazy {
    as_1605325737()
  }


  public override val __1605325737_Ptr: JNAPointer? by lazy {
    __1605325737_Interface.__1605325737_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1605325737_Interface)

  private fun as_1605325737(): ISharedPackageContainerManager.WithDefault {
    if(pointer == NULL) {
      return(ISharedPackageContainerManager.ABI.makeISharedPackageContainerManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISharedPackageContainerManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISharedPackageContainerManager.ABI.makeISharedPackageContainerManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SharedPackageContainerManager> {
    public override fun getValue() = SharedPackageContainerManager(pointer.getPointer(0))

    public fun setValue(value: SharedPackageContainerManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SharedPackageContainerManager, MemoryAddress> {
    public val ISharedPackageContainerManagerStatics_Instance: ISharedPackageContainerManagerStatics
        by lazy {
      createISharedPackageContainerManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISharedPackageContainerManagerStatics():
        ISharedPackageContainerManagerStatics {
      val refiid = Guid.REFIID(ISharedPackageContainerManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.SharedPackageContainerManager".toHandle(),refiid,interfacePtr)
      val result =
          ISharedPackageContainerManagerStatics.ABI.makeISharedPackageContainerManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SharedPackageContainerManager {
      val address = segment.toRawLongValue()
      return SharedPackageContainerManager(Pointer(address))
    }

    public override fun toNative(obj: SharedPackageContainerManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ISharedPackageContainerManagerStatics_Instance.GetDefault()

    public fun GetForUser(userSid: String) =
        ABI.ISharedPackageContainerManagerStatics_Instance.GetForUser(userSid)

    public fun GetForProvisioning() =
        ABI.ISharedPackageContainerManagerStatics_Instance.GetForProvisioning()
  }
}
