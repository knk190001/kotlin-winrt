package Windows.Devices.Display.Core

import Windows.Graphics.DisplayAdapterId
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DisplayAdapter.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayAdapter;{a56f5287-f000-5f2e-b5ac-3783a2b69af5})")
@WinRTByReference(brClass = DisplayAdapter.ByReference::class)
public class DisplayAdapter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayAdapter.WithDefault, IWinRTObject {
  private val __303741905_Interface: IDisplayAdapter.WithDefault by lazy {
    as_303741905()
  }


  public override val __303741905_Ptr: JNAPointer? by lazy {
    __303741905_Interface.__303741905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__303741905_Interface)

  private fun as_303741905(): IDisplayAdapter.WithDefault {
    if(pointer == NULL) {
      return(IDisplayAdapter.ABI.makeIDisplayAdapter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayAdapter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayAdapter.ABI.makeIDisplayAdapter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayAdapter>
      {
    public override fun getValue() = DisplayAdapter(pointer.getPointer(0))

    public fun setValue(value: DisplayAdapter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayAdapter, MemoryAddress> {
    public val IDisplayAdapterStatics_Instance: IDisplayAdapterStatics by lazy {
      createIDisplayAdapterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayAdapterStatics(): IDisplayAdapterStatics {
      val refiid = Guid.REFIID(IDisplayAdapterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.Core.DisplayAdapter".toHandle(),refiid,interfacePtr)
      val result = IDisplayAdapterStatics.ABI.makeIDisplayAdapterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayAdapter {
      val address = segment.toRawLongValue()
      return DisplayAdapter(Pointer(address))
    }

    public override fun toNative(obj: DisplayAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromId(id: DisplayAdapterId) = ABI.IDisplayAdapterStatics_Instance.FromId(id)
  }
}
