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

@ABIMarker(DeploymentResult.ABI::class)
@Signature("rc(Windows.Management.Deployment.DeploymentResult;{2563b9ae-b77d-4c1f-8a7b-20e6ad515ef3})")
@WinRTByReference(brClass = DeploymentResult.ByReference::class)
public class DeploymentResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeploymentResult.WithDefault, IDeploymentResult2.WithDefault, IWinRTObject {
  private val __1022208070_Interface: IDeploymentResult.WithDefault by lazy {
    as_1022208070()
  }


  private val __1623679148_Interface: IDeploymentResult2.WithDefault by lazy {
    as_1623679148()
  }


  public override val __1022208070_Ptr: JNAPointer? by lazy {
    __1022208070_Interface.__1022208070_Ptr
  }


  public override val __1623679148_Ptr: JNAPointer? by lazy {
    __1623679148_Interface.__1623679148_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022208070_Interface, __1623679148_Interface)

  private fun as_1022208070(): IDeploymentResult.WithDefault {
    if(pointer == NULL) {
      return(IDeploymentResult.ABI.makeIDeploymentResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeploymentResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeploymentResult.ABI.makeIDeploymentResult(ref.value))
  }

  private fun as_1623679148(): IDeploymentResult2.WithDefault {
    if(pointer == NULL) {
      return(IDeploymentResult2.ABI.makeIDeploymentResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeploymentResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeploymentResult2.ABI.makeIDeploymentResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeploymentResult> {
    public override fun getValue() = DeploymentResult(pointer.getPointer(0))

    public fun setValue(value: DeploymentResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeploymentResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeploymentResult {
      val address = segment.toRawLongValue()
      return DeploymentResult(Pointer(address))
    }

    public override fun toNative(obj: DeploymentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
