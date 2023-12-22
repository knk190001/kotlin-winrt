package Windows.Networking.Connectivity

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

@ABIMarker(DataUsage.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.DataUsage;{c1431dd3-b146-4d39-b959-0c69b096c512})")
@WinRTByReference(brClass = DataUsage.ByReference::class)
public class DataUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataUsage.WithDefault, IWinRTObject {
  private val __542344756_Interface: IDataUsage.WithDefault by lazy {
    as_542344756()
  }


  public override val __542344756_Ptr: JNAPointer? by lazy {
    __542344756_Interface.__542344756_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__542344756_Interface)

  private fun as_542344756(): IDataUsage.WithDefault {
    if(pointer == NULL) {
      return(IDataUsage.ABI.makeIDataUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataUsage.ABI.makeIDataUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataUsage> {
    public override fun getValue() = DataUsage(pointer.getPointer(0))

    public fun setValue(value: DataUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataUsage {
      val address = segment.toRawLongValue()
      return DataUsage(Pointer(address))
    }

    public override fun toNative(obj: DataUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
