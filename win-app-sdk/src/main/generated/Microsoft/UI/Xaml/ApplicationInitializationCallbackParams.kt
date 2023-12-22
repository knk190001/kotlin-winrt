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

@ABIMarker(ApplicationInitializationCallbackParams.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.ApplicationInitializationCallbackParams;{1b1906ea-5b7b-5876-81ab-7c2281ac3d20})")
@WinRTByReference(brClass = ApplicationInitializationCallbackParams.ByReference::class)
public class ApplicationInitializationCallbackParams(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationInitializationCallbackParams.WithDefault, IWinRTObject {
  private val __1114096180_Interface: IApplicationInitializationCallbackParams.WithDefault by lazy {
    as_1114096180()
  }


  public override val __1114096180_Ptr: JNAPointer? by lazy {
    __1114096180_Interface.__1114096180_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1114096180_Interface)

  private fun as_1114096180(): IApplicationInitializationCallbackParams.WithDefault {
    if(pointer == NULL) {
      return(IApplicationInitializationCallbackParams.ABI.makeIApplicationInitializationCallbackParams(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationInitializationCallbackParams>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationInitializationCallbackParams.ABI.makeIApplicationInitializationCallbackParams(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationInitializationCallbackParams> {
    public override fun getValue() = ApplicationInitializationCallbackParams(pointer.getPointer(0))

    public fun setValue(value: ApplicationInitializationCallbackParams): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationInitializationCallbackParams, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ApplicationInitializationCallbackParams {
      val address = segment.toRawLongValue()
      return ApplicationInitializationCallbackParams(Pointer(address))
    }

    public override fun toNative(obj: ApplicationInitializationCallbackParams): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
