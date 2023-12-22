package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IPathIconFactory.ABI.IID
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

@ABIMarker(PathIcon.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.PathIcon;{214c62db-c366-4a0e-b9ad-dcf168d7ec0c})")
@WinRTByReference(brClass = PathIcon.ByReference::class)
public open class PathIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IPathIcon.WithDefault, IWinRTObject {
  private val __745339482_Interface: IPathIcon.WithDefault by lazy {
    as_745339482()
  }


  public override val __745339482_Ptr: JNAPointer? by lazy {
    __745339482_Interface.__745339482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__745339482_Interface)

  public constructor() : this(ABI.activate())

  private fun as_745339482(): IPathIcon.WithDefault {
    if(pointer == NULL) {
      return(IPathIcon.ABI.makeIPathIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPathIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPathIcon.ABI.makeIPathIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PathIcon> {
    public override fun getValue() = PathIcon(pointer.getPointer(0))

    public fun setValue(value: PathIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathIcon, MemoryAddress> {
    public val IPathIconStatics_Instance: IPathIconStatics by lazy {
      createIPathIconStatics()
    }


    public val IPathIconFactory_Instance: IPathIconFactory by lazy {
      createIPathIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPathIconStatics(): IPathIconStatics {
      val refiid = Guid.REFIID(IPathIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PathIcon".toHandle(),refiid,interfacePtr)
      val result = IPathIconStatics.ABI.makeIPathIconStatics(interfacePtr.value)
      return result
    }

    public fun createIPathIconFactory(): IPathIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PathIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPathIconFactory.ABI.makeIPathIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPathIconFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PathIcon {
      val address = segment.toRawLongValue()
      return PathIcon(Pointer(address))
    }

    public override fun toNative(obj: PathIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataProperty() = ABI.IPathIconStatics_Instance.get_DataProperty()
  }
}
