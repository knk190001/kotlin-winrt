package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IPathIconSourceFactory.ABI.IID
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

@ABIMarker(PathIconSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PathIconSource;{7acdc6a5-f9aa-5d7e-8645-3c48989433a0})")
@WinRTByReference(brClass = PathIconSource.ByReference::class)
public open class PathIconSource(
  ptr: JNAPointer? = NULL
) : IconSource(ptr), IPathIconSource.WithDefault, IWinRTObject {
  private val __1605324160_Interface: IPathIconSource.WithDefault by lazy {
    as_1605324160()
  }


  public override val __1605324160_Ptr: JNAPointer? by lazy {
    __1605324160_Interface.__1605324160_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1605324160_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1605324160(): IPathIconSource.WithDefault {
    if(pointer == NULL) {
      return(IPathIconSource.ABI.makeIPathIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPathIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPathIconSource.ABI.makeIPathIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PathIconSource>
      {
    public override fun getValue() = PathIconSource(pointer.getPointer(0))

    public fun setValue(value: PathIconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathIconSource, MemoryAddress> {
    public val IPathIconSourceStatics_Instance: IPathIconSourceStatics by lazy {
      createIPathIconSourceStatics()
    }


    public val IPathIconSourceFactory_Instance: IPathIconSourceFactory by lazy {
      createIPathIconSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPathIconSourceStatics(): IPathIconSourceStatics {
      val refiid = Guid.REFIID(IPathIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PathIconSource".toHandle(),refiid,interfacePtr)
      val result = IPathIconSourceStatics.ABI.makeIPathIconSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIPathIconSourceFactory(): IPathIconSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PathIconSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPathIconSourceFactory.ABI.makeIPathIconSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPathIconSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PathIconSource {
      val address = segment.toRawLongValue()
      return PathIconSource(Pointer(address))
    }

    public override fun toNative(obj: PathIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataProperty() = ABI.IPathIconSourceStatics_Instance.get_DataProperty()
  }
}
