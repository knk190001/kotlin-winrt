package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PathFigure.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.PathFigure;{5d955c8c-5fa9-4dda-a3cc-10fcdcaa20d7})")
@WinRTByReference(brClass = PathFigure.ByReference::class)
public class PathFigure(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPathFigure.WithDefault, IWinRTObject {
  private val __1364144741_Interface: IPathFigure.WithDefault by lazy {
    as_1364144741()
  }


  public override val __1364144741_Ptr: JNAPointer? by lazy {
    __1364144741_Interface.__1364144741_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1364144741_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1364144741(): IPathFigure.WithDefault {
    if(pointer == NULL) {
      return(IPathFigure.ABI.makeIPathFigure(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPathFigure>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPathFigure.ABI.makeIPathFigure(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PathFigure> {
    public override fun getValue() = PathFigure(pointer.getPointer(0))

    public fun setValue(value: PathFigure): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathFigure, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPathFigureStatics_Instance: IPathFigureStatics by lazy {
      createIPathFigureStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.PathFigure".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIPathFigureStatics(): IPathFigureStatics {
      val refiid = Guid.REFIID(IPathFigureStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.PathFigure".toHandle(),refiid,interfacePtr)
      val result = IPathFigureStatics.ABI.makeIPathFigureStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PathFigure {
      val address = segment.toRawLongValue()
      return PathFigure(Pointer(address))
    }

    public override fun toNative(obj: PathFigure): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SegmentsProperty() = ABI.IPathFigureStatics_Instance.get_SegmentsProperty()

    public fun get_StartPointProperty() = ABI.IPathFigureStatics_Instance.get_StartPointProperty()

    public fun get_IsClosedProperty() = ABI.IPathFigureStatics_Instance.get_IsClosedProperty()

    public fun get_IsFilledProperty() = ABI.IPathFigureStatics_Instance.get_IsFilledProperty()
  }
}
