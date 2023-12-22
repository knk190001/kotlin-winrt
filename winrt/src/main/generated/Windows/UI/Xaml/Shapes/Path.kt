package Windows.UI.Xaml.Shapes

import Windows.UI.Xaml.Shapes.IPathFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Path.ABI::class)
@Signature("rc(Windows.UI.Xaml.Shapes.Path;{78883609-3d57-4f3c-b8a5-6cabcac9711f})")
@WinRTByReference(brClass = Path.ByReference::class)
public open class Path(
  ptr: JNAPointer? = NULL
) : Shape(ptr), IPath.WithDefault, IWinRTObject {
  private val __641191995_Interface: IPath.WithDefault by lazy {
    as_641191995()
  }


  public override val __641191995_Ptr: JNAPointer? by lazy {
    __641191995_Interface.__641191995_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__641191995_Interface)

  public constructor() : this(ABI.activate())

  private fun as_641191995(): IPath.WithDefault {
    if(pointer == NULL) {
      return(IPath.ABI.makeIPath(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPath>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPath.ABI.makeIPath(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Path> {
    public override fun getValue() = Path(pointer.getPointer(0))

    public fun setValue(value: Path): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Path, MemoryAddress> {
    public val IPathStatics_Instance: IPathStatics by lazy {
      createIPathStatics()
    }


    public val IPathFactory_Instance: IPathFactory by lazy {
      createIPathFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPathStatics(): IPathStatics {
      val refiid = Guid.REFIID(IPathStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Path".toHandle(),refiid,interfacePtr)
      val result = IPathStatics.ABI.makeIPathStatics(interfacePtr.value)
      return result
    }

    public fun createIPathFactory(): IPathFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Path".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPathFactory.ABI.makeIPathFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPathFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Path {
      val address = segment.toRawLongValue()
      return Path(Pointer(address))
    }

    public override fun toNative(obj: Path): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataProperty() = ABI.IPathStatics_Instance.get_DataProperty()
  }
}
