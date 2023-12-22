package Microsoft.UI.Xaml

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

@ABIMarker(XamlResourceReferenceFailedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.XamlResourceReferenceFailedEventArgs;{1b175ee6-d08b-50ff-8f89-a1ff27edef66})")
@WinRTByReference(brClass = XamlResourceReferenceFailedEventArgs.ByReference::class)
public class XamlResourceReferenceFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlResourceReferenceFailedEventArgs.WithDefault, IWinRTObject {
  private val __749216404_Interface: IXamlResourceReferenceFailedEventArgs.WithDefault by lazy {
    as_749216404()
  }


  public override val __749216404_Ptr: JNAPointer? by lazy {
    __749216404_Interface.__749216404_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__749216404_Interface)

  private fun as_749216404(): IXamlResourceReferenceFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IXamlResourceReferenceFailedEventArgs.ABI.makeIXamlResourceReferenceFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlResourceReferenceFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlResourceReferenceFailedEventArgs.ABI.makeIXamlResourceReferenceFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlResourceReferenceFailedEventArgs> {
    public override fun getValue() = XamlResourceReferenceFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: XamlResourceReferenceFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlResourceReferenceFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XamlResourceReferenceFailedEventArgs {
      val address = segment.toRawLongValue()
      return XamlResourceReferenceFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: XamlResourceReferenceFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
