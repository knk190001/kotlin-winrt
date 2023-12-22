package Microsoft.UI.Xaml.Markup

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(XamlMarkupHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Markup.XamlMarkupHelper;{cd677310-3b06-5a13-b31a-401849570858})")
@WinRTByReference(brClass = XamlMarkupHelper.ByReference::class)
public class XamlMarkupHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlMarkupHelper.WithDefault, IWinRTObject {
  private val __543331853_Interface: IXamlMarkupHelper.WithDefault by lazy {
    as_543331853()
  }


  public override val __543331853_Ptr: JNAPointer? by lazy {
    __543331853_Interface.__543331853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__543331853_Interface)

  private fun as_543331853(): IXamlMarkupHelper.WithDefault {
    if(pointer == NULL) {
      return(IXamlMarkupHelper.ABI.makeIXamlMarkupHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlMarkupHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlMarkupHelper.ABI.makeIXamlMarkupHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlMarkupHelper> {
    public override fun getValue() = XamlMarkupHelper(pointer.getPointer(0))

    public fun setValue(value: XamlMarkupHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlMarkupHelper, MemoryAddress> {
    public val IXamlMarkupHelperStatics_Instance: IXamlMarkupHelperStatics by lazy {
      createIXamlMarkupHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlMarkupHelperStatics(): IXamlMarkupHelperStatics {
      val refiid = Guid.REFIID(IXamlMarkupHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Markup.XamlMarkupHelper".toHandle(),refiid,interfacePtr)
      val result = IXamlMarkupHelperStatics.ABI.makeIXamlMarkupHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlMarkupHelper {
      val address = segment.toRawLongValue()
      return XamlMarkupHelper(Pointer(address))
    }

    public override fun toNative(obj: XamlMarkupHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun UnloadObject(element: DependencyObject) =
        ABI.IXamlMarkupHelperStatics_Instance.UnloadObject(element)
  }
}
