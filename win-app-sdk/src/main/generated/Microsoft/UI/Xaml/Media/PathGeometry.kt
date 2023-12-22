package Microsoft.UI.Xaml.Media

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

@ABIMarker(PathGeometry.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.PathGeometry;{11b9d95d-d3d9-5337-a05c-73a27a2b5124})")
@WinRTByReference(brClass = PathGeometry.ByReference::class)
public class PathGeometry(
  ptr: JNAPointer? = NULL
) : Geometry(ptr), IPathGeometry.WithDefault, IWinRTObject {
  private val __1075384936_Interface: IPathGeometry.WithDefault by lazy {
    as_1075384936()
  }


  public override val __1075384936_Ptr: JNAPointer? by lazy {
    __1075384936_Interface.__1075384936_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1075384936_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1075384936(): IPathGeometry.WithDefault {
    if(pointer == NULL) {
      return(IPathGeometry.ABI.makeIPathGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPathGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPathGeometry.ABI.makeIPathGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PathGeometry> {
    public override fun getValue() = PathGeometry(pointer.getPointer(0))

    public fun setValue(value: PathGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathGeometry, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPathGeometryStatics_Instance: IPathGeometryStatics by lazy {
      createIPathGeometryStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PathGeometry".toHandle(),
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

    public fun createIPathGeometryStatics(): IPathGeometryStatics {
      val refiid = Guid.REFIID(IPathGeometryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PathGeometry".toHandle(),refiid,interfacePtr)
      val result = IPathGeometryStatics.ABI.makeIPathGeometryStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PathGeometry {
      val address = segment.toRawLongValue()
      return PathGeometry(Pointer(address))
    }

    public override fun toNative(obj: PathGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FillRuleProperty() = ABI.IPathGeometryStatics_Instance.get_FillRuleProperty()

    public fun get_FiguresProperty() = ABI.IPathGeometryStatics_Instance.get_FiguresProperty()
  }
}
