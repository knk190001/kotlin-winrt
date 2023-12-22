package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.ICustomMapTileDataSourceFactory.ABI.IID
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

@ABIMarker(CustomMapTileDataSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.CustomMapTileDataSource;{65da384a-2db1-4be1-b155-3d0c9ecf4799})")
@WinRTByReference(brClass = CustomMapTileDataSource.ByReference::class)
public open class CustomMapTileDataSource(
  ptr: JNAPointer? = NULL
) : MapTileDataSource(ptr), ICustomMapTileDataSource.WithDefault, IWinRTObject {
  private val __1263233459_Interface: ICustomMapTileDataSource.WithDefault by lazy {
    as_1263233459()
  }


  public override val __1263233459_Ptr: JNAPointer? by lazy {
    __1263233459_Interface.__1263233459_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1263233459_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1263233459(): ICustomMapTileDataSource.WithDefault {
    if(pointer == NULL) {
      return(ICustomMapTileDataSource.ABI.makeICustomMapTileDataSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomMapTileDataSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomMapTileDataSource.ABI.makeICustomMapTileDataSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CustomMapTileDataSource> {
    public override fun getValue() = CustomMapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: CustomMapTileDataSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomMapTileDataSource, MemoryAddress> {
    public val ICustomMapTileDataSourceFactory_Instance: ICustomMapTileDataSourceFactory by lazy {
      createICustomMapTileDataSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICustomMapTileDataSourceFactory(): ICustomMapTileDataSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.CustomMapTileDataSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICustomMapTileDataSourceFactory.ABI.makeICustomMapTileDataSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ICustomMapTileDataSourceFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CustomMapTileDataSource {
      val address = segment.toRawLongValue()
      return CustomMapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: CustomMapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
