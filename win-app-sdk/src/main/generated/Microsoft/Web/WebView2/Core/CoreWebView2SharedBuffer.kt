package Microsoft.Web.WebView2.Core

import Windows.Foundation.IClosable
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

@ABIMarker(CoreWebView2SharedBuffer.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2SharedBuffer;{1aa4e213-ace3-5f74-a2ae-c6489ceb3239})")
@WinRTByReference(brClass = CoreWebView2SharedBuffer.ByReference::class)
public class CoreWebView2SharedBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2SharedBuffer_Manual.WithDefault,
    ICoreWebView2SharedBuffer.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2042864999_Interface: ICoreWebView2SharedBuffer_Manual.WithDefault by lazy {
    as_2042864999()
  }


  private val __1311921388_Interface: ICoreWebView2SharedBuffer.WithDefault by lazy {
    as_1311921388()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2042864999_Ptr: JNAPointer? by lazy {
    __2042864999_Interface.__2042864999_Ptr
  }


  public override val __1311921388_Ptr: JNAPointer? by lazy {
    __1311921388_Interface.__1311921388_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2042864999_Interface, __1311921388_Interface, __1260617006_Interface)

  private fun as_2042864999(): ICoreWebView2SharedBuffer_Manual.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2SharedBuffer_Manual.ABI.makeICoreWebView2SharedBuffer_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2SharedBuffer_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2SharedBuffer_Manual.ABI.makeICoreWebView2SharedBuffer_Manual(ref.value))
  }

  private fun as_1311921388(): ICoreWebView2SharedBuffer.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2SharedBuffer.ABI.makeICoreWebView2SharedBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2SharedBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2SharedBuffer.ABI.makeICoreWebView2SharedBuffer(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2SharedBuffer> {
    public override fun getValue() = CoreWebView2SharedBuffer(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2SharedBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2SharedBuffer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2SharedBuffer {
      val address = segment.toRawLongValue()
      return CoreWebView2SharedBuffer(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2SharedBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
