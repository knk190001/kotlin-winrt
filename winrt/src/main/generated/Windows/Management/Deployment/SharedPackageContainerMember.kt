package Windows.Management.Deployment

import Windows.Management.Deployment.ISharedPackageContainerMemberFactory.ABI.IID
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

@ABIMarker(SharedPackageContainerMember.ABI::class)
@Signature("rc(Windows.Management.Deployment.SharedPackageContainerMember;{fe0d0438-43c9-5426-b89c-f79bf85ddff4})")
@WinRTByReference(brClass = SharedPackageContainerMember.ByReference::class)
public class SharedPackageContainerMember(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISharedPackageContainerMember.WithDefault, IWinRTObject {
  private val __498739426_Interface: ISharedPackageContainerMember.WithDefault by lazy {
    as_498739426()
  }


  public override val __498739426_Ptr: JNAPointer? by lazy {
    __498739426_Interface.__498739426_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__498739426_Interface)

  public constructor(packageFamilyName: String) : this(ABI.activate(packageFamilyName))

  private fun as_498739426(): ISharedPackageContainerMember.WithDefault {
    if(pointer == NULL) {
      return(ISharedPackageContainerMember.ABI.makeISharedPackageContainerMember(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISharedPackageContainerMember>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISharedPackageContainerMember.ABI.makeISharedPackageContainerMember(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SharedPackageContainerMember> {
    public override fun getValue() = SharedPackageContainerMember(pointer.getPointer(0))

    public fun setValue(value: SharedPackageContainerMember): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SharedPackageContainerMember, MemoryAddress> {
    public val ISharedPackageContainerMemberFactory_Instance: ISharedPackageContainerMemberFactory
        by lazy {
      createISharedPackageContainerMemberFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISharedPackageContainerMemberFactory(): ISharedPackageContainerMemberFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.SharedPackageContainerMember".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISharedPackageContainerMemberFactory.ABI.makeISharedPackageContainerMemberFactory(factoryActivatorPtr.value))
    }

    public fun activate(packageFamilyName: String): JNAPointer? =
        ISharedPackageContainerMemberFactory_Instance.CreateInstance(packageFamilyName)?.pointer

    public override fun fromNative(segment: MemoryAddress): SharedPackageContainerMember {
      val address = segment.toRawLongValue()
      return SharedPackageContainerMember(Pointer(address))
    }

    public override fun toNative(obj: SharedPackageContainerMember): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
