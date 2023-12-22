package Windows.Management.Deployment

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

@ABIMarker(CreateSharedPackageContainerResult.ABI::class)
@Signature("rc(Windows.Management.Deployment.CreateSharedPackageContainerResult;{ce8810bf-151c-5707-b936-497e564afc7a})")
@WinRTByReference(brClass = CreateSharedPackageContainerResult.ByReference::class)
public class CreateSharedPackageContainerResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICreateSharedPackageContainerResult.WithDefault, IWinRTObject {
  private val __2123668291_Interface: ICreateSharedPackageContainerResult.WithDefault by lazy {
    as_2123668291()
  }


  public override val __2123668291_Ptr: JNAPointer? by lazy {
    __2123668291_Interface.__2123668291_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2123668291_Interface)

  private fun as_2123668291(): ICreateSharedPackageContainerResult.WithDefault {
    if(pointer == NULL) {
      return(ICreateSharedPackageContainerResult.ABI.makeICreateSharedPackageContainerResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICreateSharedPackageContainerResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICreateSharedPackageContainerResult.ABI.makeICreateSharedPackageContainerResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CreateSharedPackageContainerResult> {
    public override fun getValue() = CreateSharedPackageContainerResult(pointer.getPointer(0))

    public fun setValue(value: CreateSharedPackageContainerResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CreateSharedPackageContainerResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CreateSharedPackageContainerResult {
      val address = segment.toRawLongValue()
      return CreateSharedPackageContainerResult(Pointer(address))
    }

    public override fun toNative(obj: CreateSharedPackageContainerResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
