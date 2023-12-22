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

@ABIMarker(UpdateSharedPackageContainerResult.ABI::class)
@Signature("rc(Windows.Management.Deployment.UpdateSharedPackageContainerResult;{aa407df7-c72d-5458-aea3-4645b6a8ee99})")
@WinRTByReference(brClass = UpdateSharedPackageContainerResult.ByReference::class)
public class UpdateSharedPackageContainerResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUpdateSharedPackageContainerResult.WithDefault, IWinRTObject {
  private val __1237808906_Interface: IUpdateSharedPackageContainerResult.WithDefault by lazy {
    as_1237808906()
  }


  public override val __1237808906_Ptr: JNAPointer? by lazy {
    __1237808906_Interface.__1237808906_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1237808906_Interface)

  private fun as_1237808906(): IUpdateSharedPackageContainerResult.WithDefault {
    if(pointer == NULL) {
      return(IUpdateSharedPackageContainerResult.ABI.makeIUpdateSharedPackageContainerResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUpdateSharedPackageContainerResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUpdateSharedPackageContainerResult.ABI.makeIUpdateSharedPackageContainerResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UpdateSharedPackageContainerResult> {
    public override fun getValue() = UpdateSharedPackageContainerResult(pointer.getPointer(0))

    public fun setValue(value: UpdateSharedPackageContainerResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UpdateSharedPackageContainerResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UpdateSharedPackageContainerResult {
      val address = segment.toRawLongValue()
      return UpdateSharedPackageContainerResult(Pointer(address))
    }

    public override fun toNative(obj: UpdateSharedPackageContainerResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
