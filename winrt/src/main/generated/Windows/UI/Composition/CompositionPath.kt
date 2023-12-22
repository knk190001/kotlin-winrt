package Windows.UI.Composition

import Windows.Graphics.IGeometrySource2D
import Windows.UI.Composition.ICompositionPathFactory.ABI.IID
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

@ABIMarker(CompositionPath.ABI::class)
@Signature("rc(Windows.UI.Composition.CompositionPath;{66da1d5f-2e10-4f22-8a06-0a8151919e60})")
@WinRTByReference(brClass = CompositionPath.ByReference::class)
public class CompositionPath(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionPath.WithDefault, IGeometrySource2D.WithDefault, IWinRTObject {
  private val __510722945_Interface: ICompositionPath.WithDefault by lazy {
    as_510722945()
  }


  private val __397532782_Interface: IGeometrySource2D.WithDefault by lazy {
    as_397532782()
  }


  public override val __510722945_Ptr: JNAPointer? by lazy {
    __510722945_Interface.__510722945_Ptr
  }


  public override val __397532782_Ptr: JNAPointer? by lazy {
    __397532782_Interface.__397532782_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__510722945_Interface, __397532782_Interface)

  public constructor(source: IGeometrySource2D) : this(ABI.activate(source))

  private fun as_510722945(): ICompositionPath.WithDefault {
    if(pointer == NULL) {
      return(ICompositionPath.ABI.makeICompositionPath(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionPath>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionPath.ABI.makeICompositionPath(ref.value))
  }

  private fun as_397532782(): IGeometrySource2D.WithDefault {
    if(pointer == NULL) {
      return(IGeometrySource2D.ABI.makeIGeometrySource2D(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeometrySource2D>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeometrySource2D.ABI.makeIGeometrySource2D(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionPath> {
    public override fun getValue() = CompositionPath(pointer.getPointer(0))

    public fun setValue(value: CompositionPath): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionPath, MemoryAddress> {
    public val ICompositionPathFactory_Instance: ICompositionPathFactory by lazy {
      createICompositionPathFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionPathFactory(): ICompositionPathFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.CompositionPath".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICompositionPathFactory.ABI.makeICompositionPathFactory(factoryActivatorPtr.value))
    }

    public fun activate(source: IGeometrySource2D): JNAPointer? =
        ICompositionPathFactory_Instance.Create(source)?.pointer

    public override fun fromNative(segment: MemoryAddress): CompositionPath {
      val address = segment.toRawLongValue()
      return CompositionPath(Pointer(address))
    }

    public override fun toNative(obj: CompositionPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
