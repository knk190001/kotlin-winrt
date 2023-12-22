package Microsoft.UI.Input.Experimental

import Microsoft.UI.Input.InputObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ExpFocusNavigationHost.ABI::class)
@Signature("rc(Microsoft.UI.Input.Experimental.ExpFocusNavigationHost;{49b02d03-b0d8-55db-985a-48611e47e838})")
@WinRTByReference(brClass = ExpFocusNavigationHost.ByReference::class)
public class ExpFocusNavigationHost(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IExpFocusNavigationHost.WithDefault, IWinRTObject {
  private val __765784294_Interface: IExpFocusNavigationHost.WithDefault by lazy {
    as_765784294()
  }


  public override val __765784294_Ptr: JNAPointer? by lazy {
    __765784294_Interface.__765784294_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__765784294_Interface)

  private fun as_765784294(): IExpFocusNavigationHost.WithDefault {
    if(pointer == NULL) {
      return(IExpFocusNavigationHost.ABI.makeIExpFocusNavigationHost(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpFocusNavigationHost>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpFocusNavigationHost.ABI.makeIExpFocusNavigationHost(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpFocusNavigationHost> {
    public override fun getValue() = ExpFocusNavigationHost(pointer.getPointer(0))

    public fun setValue(value: ExpFocusNavigationHost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpFocusNavigationHost, MemoryAddress> {
    public val IExpFocusNavigationHostStatics_Instance: IExpFocusNavigationHostStatics by lazy {
      createIExpFocusNavigationHostStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpFocusNavigationHostStatics(): IExpFocusNavigationHostStatics {
      val refiid = Guid.REFIID(IExpFocusNavigationHostStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.Experimental.ExpFocusNavigationHost".toHandle(),refiid,interfacePtr)
      val result =
          IExpFocusNavigationHostStatics.ABI.makeIExpFocusNavigationHostStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ExpFocusNavigationHost {
      val address = segment.toRawLongValue()
      return ExpFocusNavigationHost(Pointer(address))
    }

    public override fun toNative(obj: ExpFocusNavigationHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForInputSite(inputSite: ExpInputSite) =
        ABI.IExpFocusNavigationHostStatics_Instance.GetForInputSite(inputSite)
  }
}
