package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IHttpMapTileDataSourceFactory.ABI.IID
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

@ABIMarker(HttpMapTileDataSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.HttpMapTileDataSource;{9d03cb5c-fd79-4795-87be-7e54ca0b37d0})")
@WinRTByReference(brClass = HttpMapTileDataSource.ByReference::class)
public open class HttpMapTileDataSource(
  ptr: JNAPointer? = NULL
) : MapTileDataSource(ptr), IHttpMapTileDataSource.WithDefault, IWinRTObject {
  private val __156869078_Interface: IHttpMapTileDataSource.WithDefault by lazy {
    as_156869078()
  }


  public override val __156869078_Ptr: JNAPointer? by lazy {
    __156869078_Interface.__156869078_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__156869078_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uriFormatString: String) : this(ABI.activate(uriFormatString))

  private fun as_156869078(): IHttpMapTileDataSource.WithDefault {
    if(pointer == NULL) {
      return(IHttpMapTileDataSource.ABI.makeIHttpMapTileDataSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpMapTileDataSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpMapTileDataSource.ABI.makeIHttpMapTileDataSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpMapTileDataSource> {
    public override fun getValue() = HttpMapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: HttpMapTileDataSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpMapTileDataSource, MemoryAddress> {
    public val IHttpMapTileDataSourceFactory_Instance: IHttpMapTileDataSourceFactory by lazy {
      createIHttpMapTileDataSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpMapTileDataSourceFactory(): IHttpMapTileDataSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.HttpMapTileDataSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpMapTileDataSourceFactory.ABI.makeIHttpMapTileDataSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IHttpMapTileDataSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public fun activate(uriFormatString: String): JNAPointer? =
        IHttpMapTileDataSourceFactory_Instance.CreateInstanceWithUriFormatString(uriFormatString,
        null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpMapTileDataSource {
      val address = segment.toRawLongValue()
      return HttpMapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: HttpMapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
