package Microsoft.UI.Content

import Microsoft.UI.WindowId
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

@ABIMarker(ContentCoordinateConverter.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentCoordinateConverter;{10a11230-5eb4-5840-a346-570f4a49040f})")
@WinRTByReference(brClass = ContentCoordinateConverter.ByReference::class)
public class ContentCoordinateConverter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentCoordinateConverter.WithDefault, IWinRTObject {
  private val __763303289_Interface: IContentCoordinateConverter.WithDefault by lazy {
    as_763303289()
  }


  public override val __763303289_Ptr: JNAPointer? by lazy {
    __763303289_Interface.__763303289_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__763303289_Interface)

  private fun as_763303289(): IContentCoordinateConverter.WithDefault {
    if(pointer == NULL) {
      return(IContentCoordinateConverter.ABI.makeIContentCoordinateConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentCoordinateConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentCoordinateConverter.ABI.makeIContentCoordinateConverter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentCoordinateConverter> {
    public override fun getValue() = ContentCoordinateConverter(pointer.getPointer(0))

    public fun setValue(value: ContentCoordinateConverter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentCoordinateConverter, MemoryAddress> {
    public val IContentCoordinateConverterStatics_Instance: IContentCoordinateConverterStatics by
        lazy {
      createIContentCoordinateConverterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentCoordinateConverterStatics(): IContentCoordinateConverterStatics {
      val refiid = Guid.REFIID(IContentCoordinateConverterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.ContentCoordinateConverter".toHandle(),refiid,interfacePtr)
      val result =
          IContentCoordinateConverterStatics.ABI.makeIContentCoordinateConverterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentCoordinateConverter {
      val address = segment.toRawLongValue()
      return ContentCoordinateConverter(Pointer(address))
    }

    public override fun toNative(obj: ContentCoordinateConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForWindowId(windowId: WindowId) =
        ABI.IContentCoordinateConverterStatics_Instance.CreateForWindowId(windowId)
  }
}
