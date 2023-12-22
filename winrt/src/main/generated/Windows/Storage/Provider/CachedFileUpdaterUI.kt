package Windows.Storage.Provider

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

@ABIMarker(CachedFileUpdaterUI.ABI::class)
@Signature("rc(Windows.Storage.Provider.CachedFileUpdaterUI;{9e6f41e6-baf2-4a97-b600-9333f5df80fd})")
@WinRTByReference(brClass = CachedFileUpdaterUI.ByReference::class)
public class CachedFileUpdaterUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICachedFileUpdaterUI.WithDefault, ICachedFileUpdaterUI2.WithDefault,
    IWinRTObject {
  private val __1598716133_Interface: ICachedFileUpdaterUI.WithDefault by lazy {
    as_1598716133()
  }


  private val __1979407379_Interface: ICachedFileUpdaterUI2.WithDefault by lazy {
    as_1979407379()
  }


  public override val __1598716133_Ptr: JNAPointer? by lazy {
    __1598716133_Interface.__1598716133_Ptr
  }


  public override val __1979407379_Ptr: JNAPointer? by lazy {
    __1979407379_Interface.__1979407379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1598716133_Interface, __1979407379_Interface)

  private fun as_1598716133(): ICachedFileUpdaterUI.WithDefault {
    if(pointer == NULL) {
      return(ICachedFileUpdaterUI.ABI.makeICachedFileUpdaterUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICachedFileUpdaterUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICachedFileUpdaterUI.ABI.makeICachedFileUpdaterUI(ref.value))
  }

  private fun as_1979407379(): ICachedFileUpdaterUI2.WithDefault {
    if(pointer == NULL) {
      return(ICachedFileUpdaterUI2.ABI.makeICachedFileUpdaterUI2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICachedFileUpdaterUI2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICachedFileUpdaterUI2.ABI.makeICachedFileUpdaterUI2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CachedFileUpdaterUI> {
    public override fun getValue() = CachedFileUpdaterUI(pointer.getPointer(0))

    public fun setValue(value: CachedFileUpdaterUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CachedFileUpdaterUI, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CachedFileUpdaterUI {
      val address = segment.toRawLongValue()
      return CachedFileUpdaterUI(Pointer(address))
    }

    public override fun toNative(obj: CachedFileUpdaterUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
