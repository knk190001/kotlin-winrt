package Windows.ApplicationModel

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

@ABIMarker(AppDisplayInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppDisplayInfo;{1aeb1103-e4d4-41aa-a4f6-c4a276e79eac})")
@WinRTByReference(brClass = AppDisplayInfo.ByReference::class)
public class AppDisplayInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppDisplayInfo.WithDefault, IWinRTObject {
  private val __555030484_Interface: IAppDisplayInfo.WithDefault by lazy {
    as_555030484()
  }


  public override val __555030484_Ptr: JNAPointer? by lazy {
    __555030484_Interface.__555030484_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__555030484_Interface)

  private fun as_555030484(): IAppDisplayInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppDisplayInfo.ABI.makeIAppDisplayInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDisplayInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDisplayInfo.ABI.makeIAppDisplayInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppDisplayInfo>
      {
    public override fun getValue() = AppDisplayInfo(pointer.getPointer(0))

    public fun setValue(value: AppDisplayInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppDisplayInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppDisplayInfo {
      val address = segment.toRawLongValue()
      return AppDisplayInfo(Pointer(address))
    }

    public override fun toNative(obj: AppDisplayInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
