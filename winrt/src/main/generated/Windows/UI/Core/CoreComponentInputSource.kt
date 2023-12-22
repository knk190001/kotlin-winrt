package Windows.UI.Core

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

@ABIMarker(CoreComponentInputSource.ABI::class)
@Signature("rc(Windows.UI.Core.CoreComponentInputSource;{9f488807-4580-4be8-be68-92a9311713bb})")
@WinRTByReference(brClass = CoreComponentInputSource.ByReference::class)
public class CoreComponentInputSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInputSourceBase.WithDefault, ICorePointerInputSource.WithDefault,
    ICoreKeyboardInputSource.WithDefault, ICoreComponentFocusable.WithDefault,
    ICoreTouchHitTesting.WithDefault, ICoreClosestInteractiveBoundsRequested.WithDefault,
    ICoreKeyboardInputSource2.WithDefault, ICorePointerInputSource2.WithDefault, IWinRTObject {
  private val __218075036_Interface: ICoreInputSourceBase.WithDefault by lazy {
    as_218075036()
  }


  private val __1725612450_Interface: ICorePointerInputSource.WithDefault by lazy {
    as_1725612450()
  }


  private val __2008525252_Interface: ICoreKeyboardInputSource.WithDefault by lazy {
    as_2008525252()
  }


  private val __1843433807_Interface: ICoreComponentFocusable.WithDefault by lazy {
    as_1843433807()
  }


  private val __1598768706_Interface: ICoreTouchHitTesting.WithDefault by lazy {
    as_1598768706()
  }


  private val __2101848234_Interface: ICoreClosestInteractiveBoundsRequested.WithDefault by lazy {
    as_2101848234()
  }


  private val __2134740718_Interface: ICoreKeyboardInputSource2.WithDefault by lazy {
    as_2134740718()
  }


  private val __1954378448_Interface: ICorePointerInputSource2.WithDefault by lazy {
    as_1954378448()
  }


  public override val __218075036_Ptr: JNAPointer? by lazy {
    __218075036_Interface.__218075036_Ptr
  }


  public override val __1725612450_Ptr: JNAPointer? by lazy {
    __1725612450_Interface.__1725612450_Ptr
  }


  public override val __2008525252_Ptr: JNAPointer? by lazy {
    __2008525252_Interface.__2008525252_Ptr
  }


  public override val __1843433807_Ptr: JNAPointer? by lazy {
    __1843433807_Interface.__1843433807_Ptr
  }


  public override val __1598768706_Ptr: JNAPointer? by lazy {
    __1598768706_Interface.__1598768706_Ptr
  }


  public override val __2101848234_Ptr: JNAPointer? by lazy {
    __2101848234_Interface.__2101848234_Ptr
  }


  public override val __2134740718_Ptr: JNAPointer? by lazy {
    __2134740718_Interface.__2134740718_Ptr
  }


  public override val __1954378448_Ptr: JNAPointer? by lazy {
    __1954378448_Interface.__1954378448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__218075036_Interface, __1725612450_Interface, __2008525252_Interface,
        __1843433807_Interface, __1598768706_Interface, __2101848234_Interface,
        __2134740718_Interface, __1954378448_Interface)

  private fun as_218075036(): ICoreInputSourceBase.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputSourceBase.ABI.makeICoreInputSourceBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputSourceBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputSourceBase.ABI.makeICoreInputSourceBase(ref.value))
  }

  private fun as_1725612450(): ICorePointerInputSource.WithDefault {
    if(pointer == NULL) {
      return(ICorePointerInputSource.ABI.makeICorePointerInputSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICorePointerInputSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICorePointerInputSource.ABI.makeICorePointerInputSource(ref.value))
  }

  private fun as_2008525252(): ICoreKeyboardInputSource.WithDefault {
    if(pointer == NULL) {
      return(ICoreKeyboardInputSource.ABI.makeICoreKeyboardInputSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreKeyboardInputSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreKeyboardInputSource.ABI.makeICoreKeyboardInputSource(ref.value))
  }

  private fun as_1843433807(): ICoreComponentFocusable.WithDefault {
    if(pointer == NULL) {
      return(ICoreComponentFocusable.ABI.makeICoreComponentFocusable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreComponentFocusable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreComponentFocusable.ABI.makeICoreComponentFocusable(ref.value))
  }

  private fun as_1598768706(): ICoreTouchHitTesting.WithDefault {
    if(pointer == NULL) {
      return(ICoreTouchHitTesting.ABI.makeICoreTouchHitTesting(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTouchHitTesting>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTouchHitTesting.ABI.makeICoreTouchHitTesting(ref.value))
  }

  private fun as_2101848234(): ICoreClosestInteractiveBoundsRequested.WithDefault {
    if(pointer == NULL) {
      return(ICoreClosestInteractiveBoundsRequested.ABI.makeICoreClosestInteractiveBoundsRequested(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreClosestInteractiveBoundsRequested>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreClosestInteractiveBoundsRequested.ABI.makeICoreClosestInteractiveBoundsRequested(ref.value))
  }

  private fun as_2134740718(): ICoreKeyboardInputSource2.WithDefault {
    if(pointer == NULL) {
      return(ICoreKeyboardInputSource2.ABI.makeICoreKeyboardInputSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreKeyboardInputSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreKeyboardInputSource2.ABI.makeICoreKeyboardInputSource2(ref.value))
  }

  private fun as_1954378448(): ICorePointerInputSource2.WithDefault {
    if(pointer == NULL) {
      return(ICorePointerInputSource2.ABI.makeICorePointerInputSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICorePointerInputSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICorePointerInputSource2.ABI.makeICorePointerInputSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreComponentInputSource> {
    public override fun getValue() = CoreComponentInputSource(pointer.getPointer(0))

    public fun setValue(value: CoreComponentInputSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreComponentInputSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreComponentInputSource {
      val address = segment.toRawLongValue()
      return CoreComponentInputSource(Pointer(address))
    }

    public override fun toNative(obj: CoreComponentInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
