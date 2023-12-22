package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialTappedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialTappedEventArgs;{296d83de-f444-4aa1-b2bf-9dc88d567da6})")
@WinRTByReference(brClass = SpatialTappedEventArgs.ByReference::class)
public class SpatialTappedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialTappedEventArgs.WithDefault, IWinRTObject {
  private val __84365151_Interface: ISpatialTappedEventArgs.WithDefault by lazy {
    as_84365151()
  }


  public override val __84365151_Ptr: JNAPointer? by lazy {
    __84365151_Interface.__84365151_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__84365151_Interface)

  private fun as_84365151(): ISpatialTappedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialTappedEventArgs.ABI.makeISpatialTappedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialTappedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialTappedEventArgs.ABI.makeISpatialTappedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialTappedEventArgs> {
    public override fun getValue() = SpatialTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialTappedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialTappedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialTappedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
