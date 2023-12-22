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

@ABIMarker(SharedPackageContainer.ABI::class)
@Signature("rc(Windows.Management.Deployment.SharedPackageContainer;{177f1aa9-151e-5ef7-b1d9-2fba0b4b0d17})")
@WinRTByReference(brClass = SharedPackageContainer.ByReference::class)
public class SharedPackageContainer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISharedPackageContainer.WithDefault, IWinRTObject {
  private val __1510507676_Interface: ISharedPackageContainer.WithDefault by lazy {
    as_1510507676()
  }


  public override val __1510507676_Ptr: JNAPointer? by lazy {
    __1510507676_Interface.__1510507676_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1510507676_Interface)

  private fun as_1510507676(): ISharedPackageContainer.WithDefault {
    if(pointer == NULL) {
      return(ISharedPackageContainer.ABI.makeISharedPackageContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISharedPackageContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISharedPackageContainer.ABI.makeISharedPackageContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SharedPackageContainer> {
    public override fun getValue() = SharedPackageContainer(pointer.getPointer(0))

    public fun setValue(value: SharedPackageContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SharedPackageContainer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SharedPackageContainer {
      val address = segment.toRawLongValue()
      return SharedPackageContainer(Pointer(address))
    }

    public override fun toNative(obj: SharedPackageContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
