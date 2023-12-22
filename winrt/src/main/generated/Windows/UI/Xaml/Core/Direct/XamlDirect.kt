package Windows.UI.Xaml.Core.Direct

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

@ABIMarker(XamlDirect.ABI::class)
@Signature("rc(Windows.UI.Xaml.Core.Direct.XamlDirect;{5ffa1295-add2-590f-a051-70989b866ade})")
@WinRTByReference(brClass = XamlDirect.ByReference::class)
public class XamlDirect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlDirect.WithDefault, IWinRTObject {
  private val __2082189255_Interface: IXamlDirect.WithDefault by lazy {
    as_2082189255()
  }


  public override val __2082189255_Ptr: JNAPointer? by lazy {
    __2082189255_Interface.__2082189255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2082189255_Interface)

  private fun as_2082189255(): IXamlDirect.WithDefault {
    if(pointer == NULL) {
      return(IXamlDirect.ABI.makeIXamlDirect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlDirect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlDirect.ABI.makeIXamlDirect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XamlDirect> {
    public override fun getValue() = XamlDirect(pointer.getPointer(0))

    public fun setValue(value: XamlDirect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlDirect, MemoryAddress> {
    public val IXamlDirectStatics_Instance: IXamlDirectStatics by lazy {
      createIXamlDirectStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlDirectStatics(): IXamlDirectStatics {
      val refiid = Guid.REFIID(IXamlDirectStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Core.Direct.XamlDirect".toHandle(),refiid,interfacePtr)
      val result = IXamlDirectStatics.ABI.makeIXamlDirectStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlDirect {
      val address = segment.toRawLongValue()
      return XamlDirect(Pointer(address))
    }

    public override fun toNative(obj: XamlDirect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IXamlDirectStatics_Instance.GetDefault()
  }
}
