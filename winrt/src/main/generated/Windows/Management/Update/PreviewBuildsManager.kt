package Windows.Management.Update

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

@ABIMarker(PreviewBuildsManager.ABI::class)
@Signature("rc(Windows.Management.Update.PreviewBuildsManager;{fa07dd61-7e4f-59f7-7c9f-def9051c5f62})")
@WinRTByReference(brClass = PreviewBuildsManager.ByReference::class)
public class PreviewBuildsManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPreviewBuildsManager.WithDefault, IWinRTObject {
  private val __861963456_Interface: IPreviewBuildsManager.WithDefault by lazy {
    as_861963456()
  }


  public override val __861963456_Ptr: JNAPointer? by lazy {
    __861963456_Interface.__861963456_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__861963456_Interface)

  private fun as_861963456(): IPreviewBuildsManager.WithDefault {
    if(pointer == NULL) {
      return(IPreviewBuildsManager.ABI.makeIPreviewBuildsManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPreviewBuildsManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPreviewBuildsManager.ABI.makeIPreviewBuildsManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PreviewBuildsManager> {
    public override fun getValue() = PreviewBuildsManager(pointer.getPointer(0))

    public fun setValue(value: PreviewBuildsManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PreviewBuildsManager, MemoryAddress> {
    public val IPreviewBuildsManagerStatics_Instance: IPreviewBuildsManagerStatics by lazy {
      createIPreviewBuildsManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPreviewBuildsManagerStatics(): IPreviewBuildsManagerStatics {
      val refiid = Guid.REFIID(IPreviewBuildsManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Update.PreviewBuildsManager".toHandle(),refiid,interfacePtr)
      val result =
          IPreviewBuildsManagerStatics.ABI.makeIPreviewBuildsManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PreviewBuildsManager {
      val address = segment.toRawLongValue()
      return PreviewBuildsManager(Pointer(address))
    }

    public override fun toNative(obj: PreviewBuildsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IPreviewBuildsManagerStatics_Instance.GetDefault()

    public fun IsSupported() = ABI.IPreviewBuildsManagerStatics_Instance.IsSupported()
  }
}
