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

@ABIMarker(CoreIndependentInputSource.ABI::class)
@Signature("rc(Windows.UI.Core.CoreIndependentInputSource;{9f488807-4580-4be8-be68-92a9311713bb})")
@WinRTByReference(brClass = CoreIndependentInputSource.ByReference::class)
public class CoreIndependentInputSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInputSourceBase.WithDefault, ICorePointerInputSource.WithDefault,
    ICorePointerInputSource2.WithDefault, ICorePointerRedirector.WithDefault, IWinRTObject {
  private val __218075036_Interface: ICoreInputSourceBase.WithDefault by lazy {
    as_218075036()
  }


  private val __1725612450_Interface: ICorePointerInputSource.WithDefault by lazy {
    as_1725612450()
  }


  private val __1954378448_Interface: ICorePointerInputSource2.WithDefault by lazy {
    as_1954378448()
  }


  private val __683430402_Interface: ICorePointerRedirector.WithDefault by lazy {
    as_683430402()
  }


  public override val __218075036_Ptr: JNAPointer? by lazy {
    __218075036_Interface.__218075036_Ptr
  }


  public override val __1725612450_Ptr: JNAPointer? by lazy {
    __1725612450_Interface.__1725612450_Ptr
  }


  public override val __1954378448_Ptr: JNAPointer? by lazy {
    __1954378448_Interface.__1954378448_Ptr
  }


  public override val __683430402_Ptr: JNAPointer? by lazy {
    __683430402_Interface.__683430402_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__218075036_Interface, __1725612450_Interface, __1954378448_Interface,
        __683430402_Interface)

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

  private fun as_1954378448(): ICorePointerInputSource2.WithDefault {
    if(pointer == NULL) {
      return(ICorePointerInputSource2.ABI.makeICorePointerInputSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICorePointerInputSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICorePointerInputSource2.ABI.makeICorePointerInputSource2(ref.value))
  }

  private fun as_683430402(): ICorePointerRedirector.WithDefault {
    if(pointer == NULL) {
      return(ICorePointerRedirector.ABI.makeICorePointerRedirector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICorePointerRedirector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICorePointerRedirector.ABI.makeICorePointerRedirector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreIndependentInputSource> {
    public override fun getValue() = CoreIndependentInputSource(pointer.getPointer(0))

    public fun setValue(value: CoreIndependentInputSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreIndependentInputSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreIndependentInputSource {
      val address = segment.toRawLongValue()
      return CoreIndependentInputSource(Pointer(address))
    }

    public override fun toNative(obj: CoreIndependentInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
