package Windows.Perception.Spatial

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SpatialAnchorTransferManager.ABI::class)
@WinRTByReference(brClass = SpatialAnchorTransferManager.ByReference::class)
public class SpatialAnchorTransferManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAnchorTransferManager> {
    public override fun getValue() = SpatialAnchorTransferManager(pointer.getPointer(0))

    public fun setValue(value: SpatialAnchorTransferManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAnchorTransferManager, MemoryAddress> {
    public val ISpatialAnchorTransferManagerStatics_Instance: ISpatialAnchorTransferManagerStatics
        by lazy {
      createISpatialAnchorTransferManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialAnchorTransferManagerStatics(): ISpatialAnchorTransferManagerStatics {
      val refiid = Guid.REFIID(ISpatialAnchorTransferManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialAnchorTransferManager".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialAnchorTransferManagerStatics.ABI.makeISpatialAnchorTransferManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialAnchorTransferManager {
      val address = segment.toRawLongValue()
      return SpatialAnchorTransferManager(Pointer(address))
    }

    public override fun toNative(obj: SpatialAnchorTransferManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryImportAnchorsAsync(stream: IInputStream) =
        ABI.ISpatialAnchorTransferManagerStatics_Instance.TryImportAnchorsAsync(stream)

    public fun TryExportAnchorsAsync(anchors: IIterable<IKeyValuePair<String?, SpatialAnchor?>?>,
        stream: IOutputStream) =
        ABI.ISpatialAnchorTransferManagerStatics_Instance.TryExportAnchorsAsync(anchors, stream)

    public fun RequestAccessAsync() =
        ABI.ISpatialAnchorTransferManagerStatics_Instance.RequestAccessAsync()
  }
}
