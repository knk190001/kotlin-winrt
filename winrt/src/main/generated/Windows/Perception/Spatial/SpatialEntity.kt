package Windows.Perception.Spatial

import Windows.Foundation.Collections.ValueSet
import Windows.Perception.Spatial.ISpatialEntityFactory.ABI.IID
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

@ABIMarker(SpatialEntity.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialEntity;{166de955-e1eb-454c-ba08-e6c0668ddc65})")
@WinRTByReference(brClass = SpatialEntity.ByReference::class)
public class SpatialEntity(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialEntity.WithDefault, IWinRTObject {
  private val __1916688356_Interface: ISpatialEntity.WithDefault by lazy {
    as_1916688356()
  }


  public override val __1916688356_Ptr: JNAPointer? by lazy {
    __1916688356_Interface.__1916688356_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1916688356_Interface)

  public constructor(spatialAnchor: SpatialAnchor) : this(ABI.activate(spatialAnchor))

  public constructor(spatialAnchor: SpatialAnchor, propertySet: ValueSet) :
      this(ABI.activate(spatialAnchor, propertySet))

  private fun as_1916688356(): ISpatialEntity.WithDefault {
    if(pointer == NULL) {
      return(ISpatialEntity.ABI.makeISpatialEntity(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialEntity>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialEntity.ABI.makeISpatialEntity(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpatialEntity>
      {
    public override fun getValue() = SpatialEntity(pointer.getPointer(0))

    public fun setValue(value: SpatialEntity): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialEntity, MemoryAddress> {
    public val ISpatialEntityFactory_Instance: ISpatialEntityFactory by lazy {
      createISpatialEntityFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialEntityFactory(): ISpatialEntityFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialEntity".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpatialEntityFactory.ABI.makeISpatialEntityFactory(factoryActivatorPtr.value))
    }

    public fun activate(spatialAnchor: SpatialAnchor): JNAPointer? =
        ISpatialEntityFactory_Instance.CreateWithSpatialAnchor(spatialAnchor)?.pointer

    public fun activate(spatialAnchor: SpatialAnchor, propertySet: ValueSet): JNAPointer? =
        ISpatialEntityFactory_Instance.CreateWithSpatialAnchorAndProperties(spatialAnchor,
        propertySet)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpatialEntity {
      val address = segment.toRawLongValue()
      return SpatialEntity(Pointer(address))
    }

    public override fun toNative(obj: SpatialEntity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
