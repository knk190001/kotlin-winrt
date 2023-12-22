package Windows.UI.Shell

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

@ABIMarker(ShareWindowCommandSource.ABI::class)
@Signature("rc(Windows.UI.Shell.ShareWindowCommandSource;{cb3b7ae3-6b9c-561e-bccc-61e68e0abfef})")
@WinRTByReference(brClass = ShareWindowCommandSource.ByReference::class)
public class ShareWindowCommandSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareWindowCommandSource.WithDefault, IWinRTObject {
  private val __97601025_Interface: IShareWindowCommandSource.WithDefault by lazy {
    as_97601025()
  }


  public override val __97601025_Ptr: JNAPointer? by lazy {
    __97601025_Interface.__97601025_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__97601025_Interface)

  private fun as_97601025(): IShareWindowCommandSource.WithDefault {
    if(pointer == NULL) {
      return(IShareWindowCommandSource.ABI.makeIShareWindowCommandSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareWindowCommandSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareWindowCommandSource.ABI.makeIShareWindowCommandSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShareWindowCommandSource> {
    public override fun getValue() = ShareWindowCommandSource(pointer.getPointer(0))

    public fun setValue(value: ShareWindowCommandSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareWindowCommandSource, MemoryAddress> {
    public val IShareWindowCommandSourceStatics_Instance: IShareWindowCommandSourceStatics by lazy {
      createIShareWindowCommandSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIShareWindowCommandSourceStatics(): IShareWindowCommandSourceStatics {
      val refiid = Guid.REFIID(IShareWindowCommandSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Shell.ShareWindowCommandSource".toHandle(),refiid,interfacePtr)
      val result =
          IShareWindowCommandSourceStatics.ABI.makeIShareWindowCommandSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ShareWindowCommandSource {
      val address = segment.toRawLongValue()
      return ShareWindowCommandSource(Pointer(address))
    }

    public override fun toNative(obj: ShareWindowCommandSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IShareWindowCommandSourceStatics_Instance.GetForCurrentView()
  }
}
