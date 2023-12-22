package Windows.Media.Devices.Core

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

@ABIMarker(FrameFocusCapabilities.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameFocusCapabilities;{7b25cd58-01c0-4065-9c40-c1a721425c1a})")
@WinRTByReference(brClass = FrameFocusCapabilities.ByReference::class)
public class FrameFocusCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameFocusCapabilities.WithDefault, IWinRTObject {
  private val __1860887771_Interface: IFrameFocusCapabilities.WithDefault by lazy {
    as_1860887771()
  }


  public override val __1860887771_Ptr: JNAPointer? by lazy {
    __1860887771_Interface.__1860887771_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1860887771_Interface)

  private fun as_1860887771(): IFrameFocusCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IFrameFocusCapabilities.ABI.makeIFrameFocusCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameFocusCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameFocusCapabilities.ABI.makeIFrameFocusCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameFocusCapabilities> {
    public override fun getValue() = FrameFocusCapabilities(pointer.getPointer(0))

    public fun setValue(value: FrameFocusCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameFocusCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameFocusCapabilities {
      val address = segment.toRawLongValue()
      return FrameFocusCapabilities(Pointer(address))
    }

    public override fun toNative(obj: FrameFocusCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
