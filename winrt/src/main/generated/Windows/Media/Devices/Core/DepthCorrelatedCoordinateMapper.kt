package Windows.Media.Devices.Core

import Windows.Foundation.IClosable
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

@ABIMarker(DepthCorrelatedCoordinateMapper.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.DepthCorrelatedCoordinateMapper;{f95d89fb-8af0-4cb0-926d-696866e5046a})")
@WinRTByReference(brClass = DepthCorrelatedCoordinateMapper.ByReference::class)
public class DepthCorrelatedCoordinateMapper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDepthCorrelatedCoordinateMapper.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __507287267_Interface: IDepthCorrelatedCoordinateMapper.WithDefault by lazy {
    as_507287267()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __507287267_Ptr: JNAPointer? by lazy {
    __507287267_Interface.__507287267_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__507287267_Interface, __1260617006_Interface)

  private fun as_507287267(): IDepthCorrelatedCoordinateMapper.WithDefault {
    if(pointer == NULL) {
      return(IDepthCorrelatedCoordinateMapper.ABI.makeIDepthCorrelatedCoordinateMapper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDepthCorrelatedCoordinateMapper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDepthCorrelatedCoordinateMapper.ABI.makeIDepthCorrelatedCoordinateMapper(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DepthCorrelatedCoordinateMapper> {
    public override fun getValue() = DepthCorrelatedCoordinateMapper(pointer.getPointer(0))

    public fun setValue(value: DepthCorrelatedCoordinateMapper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DepthCorrelatedCoordinateMapper, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DepthCorrelatedCoordinateMapper {
      val address = segment.toRawLongValue()
      return DepthCorrelatedCoordinateMapper(Pointer(address))
    }

    public override fun toNative(obj: DepthCorrelatedCoordinateMapper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
