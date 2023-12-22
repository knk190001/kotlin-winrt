package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.ILocalMapTileDataSourceFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LocalMapTileDataSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.LocalMapTileDataSource;{616257b5-9108-4f12-8bf4-bb3c8f6274e5})")
@WinRTByReference(brClass = LocalMapTileDataSource.ByReference::class)
public open class LocalMapTileDataSource(
  ptr: JNAPointer? = NULL
) : MapTileDataSource(ptr), ILocalMapTileDataSource.WithDefault, IWinRTObject {
  private val __2088450197_Interface: ILocalMapTileDataSource.WithDefault by lazy {
    as_2088450197()
  }


  public override val __2088450197_Ptr: JNAPointer? by lazy {
    __2088450197_Interface.__2088450197_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2088450197_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uriFormatString: String) : this(ABI.activate(uriFormatString))

  private fun as_2088450197(): ILocalMapTileDataSource.WithDefault {
    if(pointer == NULL) {
      return(ILocalMapTileDataSource.ABI.makeILocalMapTileDataSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocalMapTileDataSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocalMapTileDataSource.ABI.makeILocalMapTileDataSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LocalMapTileDataSource> {
    public override fun getValue() = LocalMapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: LocalMapTileDataSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalMapTileDataSource, MemoryAddress> {
    public val ILocalMapTileDataSourceFactory_Instance: ILocalMapTileDataSourceFactory by lazy {
      createILocalMapTileDataSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILocalMapTileDataSourceFactory(): ILocalMapTileDataSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.LocalMapTileDataSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILocalMapTileDataSourceFactory.ABI.makeILocalMapTileDataSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ILocalMapTileDataSourceFactory_Instance.CreateInstance(null, null)?.pointer

    public fun activate(uriFormatString: String): JNAPointer? =
        ILocalMapTileDataSourceFactory_Instance.CreateInstanceWithUriFormatString(uriFormatString,
        null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): LocalMapTileDataSource {
      val address = segment.toRawLongValue()
      return LocalMapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: LocalMapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
