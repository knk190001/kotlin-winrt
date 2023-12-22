package Windows.UI.Xaml.Controls.Maps

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapTileUriRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapTileUriRequestedEventArgs;{d2147b43-1bbf-4b98-8dd3-b7834e407e0d})")
@WinRTByReference(brClass = MapTileUriRequestedEventArgs.ByReference::class)
public class MapTileUriRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapTileUriRequestedEventArgs.WithDefault,
    IMapTileUriRequestedEventArgs2.WithDefault, IWinRTObject {
  private val __667039972_Interface: IMapTileUriRequestedEventArgs.WithDefault by lazy {
    as_667039972()
  }


  private val __796597398_Interface: IMapTileUriRequestedEventArgs2.WithDefault by lazy {
    as_796597398()
  }


  public override val __667039972_Ptr: JNAPointer? by lazy {
    __667039972_Interface.__667039972_Ptr
  }


  public override val __796597398_Ptr: JNAPointer? by lazy {
    __796597398_Interface.__796597398_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__667039972_Interface, __796597398_Interface)

  public constructor() : this(ABI.activate())

  private fun as_667039972(): IMapTileUriRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapTileUriRequestedEventArgs.ABI.makeIMapTileUriRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileUriRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileUriRequestedEventArgs.ABI.makeIMapTileUriRequestedEventArgs(ref.value))
  }

  private fun as_796597398(): IMapTileUriRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IMapTileUriRequestedEventArgs2.ABI.makeIMapTileUriRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileUriRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileUriRequestedEventArgs2.ABI.makeIMapTileUriRequestedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapTileUriRequestedEventArgs> {
    public override fun getValue() = MapTileUriRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapTileUriRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapTileUriRequestedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileUriRequestedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapTileUriRequestedEventArgs {
      val address = segment.toRawLongValue()
      return MapTileUriRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapTileUriRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
