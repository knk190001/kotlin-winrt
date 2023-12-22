package Windows.Perception.Spatial

import Windows.System.RemoteSystems.RemoteSystemSession
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

@ABIMarker(SpatialEntityStore.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialEntityStore;{329788ba-e513-4f06-889d-1be30ecf43e6})")
@WinRTByReference(brClass = SpatialEntityStore.ByReference::class)
public class SpatialEntityStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialEntityStore.WithDefault, IWinRTObject {
  private val __1140391773_Interface: ISpatialEntityStore.WithDefault by lazy {
    as_1140391773()
  }


  public override val __1140391773_Ptr: JNAPointer? by lazy {
    __1140391773_Interface.__1140391773_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1140391773_Interface)

  private fun as_1140391773(): ISpatialEntityStore.WithDefault {
    if(pointer == NULL) {
      return(ISpatialEntityStore.ABI.makeISpatialEntityStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialEntityStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialEntityStore.ABI.makeISpatialEntityStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialEntityStore> {
    public override fun getValue() = SpatialEntityStore(pointer.getPointer(0))

    public fun setValue(value: SpatialEntityStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialEntityStore, MemoryAddress> {
    public val ISpatialEntityStoreStatics_Instance: ISpatialEntityStoreStatics by lazy {
      createISpatialEntityStoreStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialEntityStoreStatics(): ISpatialEntityStoreStatics {
      val refiid = Guid.REFIID(ISpatialEntityStoreStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialEntityStore".toHandle(),refiid,interfacePtr)
      val result = ISpatialEntityStoreStatics.ABI.makeISpatialEntityStoreStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialEntityStore {
      val address = segment.toRawLongValue()
      return SpatialEntityStore(Pointer(address))
    }

    public override fun toNative(obj: SpatialEntityStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsSupported() = ABI.ISpatialEntityStoreStatics_Instance.get_IsSupported()

    public fun TryGet(session: RemoteSystemSession) =
        ABI.ISpatialEntityStoreStatics_Instance.TryGet(session)
  }
}
