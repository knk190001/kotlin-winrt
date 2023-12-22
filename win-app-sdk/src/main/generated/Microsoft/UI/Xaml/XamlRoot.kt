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

@ABIMarker(XamlRoot.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.XamlRoot;{60cb215a-ad15-520a-8b01-4416824f0441})")
@WinRTByReference(brClass = XamlRoot.ByReference::class)
public class XamlRoot(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlRoot.WithDefault, IXamlRoot2.WithDefault, IWinRTObject {
  private val __1913657489_Interface: IXamlRoot.WithDefault by lazy {
    as_1913657489()
  }


  private val __806159935_Interface: IXamlRoot2.WithDefault by lazy {
    as_806159935()
  }


  public override val __1913657489_Ptr: JNAPointer? by lazy {
    __1913657489_Interface.__1913657489_Ptr
  }


  public override val __806159935_Ptr: JNAPointer? by lazy {
    __806159935_Interface.__806159935_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1913657489_Interface, __806159935_Interface)

  private fun as_1913657489(): IXamlRoot.WithDefault {
    if(pointer == NULL) {
      return(IXamlRoot.ABI.makeIXamlRoot(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlRoot>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlRoot.ABI.makeIXamlRoot(ref.value))
  }

  private fun as_806159935(): IXamlRoot2.WithDefault {
    if(pointer == NULL) {
      return(IXamlRoot2.ABI.makeIXamlRoot2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlRoot2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlRoot2.ABI.makeIXamlRoot2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XamlRoot> {
    public override fun getValue() = XamlRoot(pointer.getPointer(0))

    public fun setValue(value: XamlRoot): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlRoot, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XamlRoot {
      val address = segment.toRawLongValue()
      return XamlRoot(Pointer(address))
    }

    public override fun toNative(obj: XamlRoot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
