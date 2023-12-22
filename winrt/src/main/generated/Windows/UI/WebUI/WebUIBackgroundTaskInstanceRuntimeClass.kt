package Windows.UI.WebUI

import Windows.ApplicationModel.Background.IBackgroundTaskInstance
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

@ABIMarker(WebUIBackgroundTaskInstanceRuntimeClass.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass;{23f12c25-e2f7-4741-bc9c-394595de24dc})")
@WinRTByReference(brClass = WebUIBackgroundTaskInstanceRuntimeClass.ByReference::class)
public class WebUIBackgroundTaskInstanceRuntimeClass(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUIBackgroundTaskInstance.WithDefault, IBackgroundTaskInstance.WithDefault,
    IWinRTObject {
  private val __1981820704_Interface: IWebUIBackgroundTaskInstance.WithDefault by lazy {
    as_1981820704()
  }


  private val __1930790727_Interface: IBackgroundTaskInstance.WithDefault by lazy {
    as_1930790727()
  }


  public override val __1981820704_Ptr: JNAPointer? by lazy {
    __1981820704_Interface.__1981820704_Ptr
  }


  public override val __1930790727_Ptr: JNAPointer? by lazy {
    __1930790727_Interface.__1930790727_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1981820704_Interface, __1930790727_Interface)

  private fun as_1981820704(): IWebUIBackgroundTaskInstance.WithDefault {
    if(pointer == NULL) {
      return(IWebUIBackgroundTaskInstance.ABI.makeIWebUIBackgroundTaskInstance(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUIBackgroundTaskInstance>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUIBackgroundTaskInstance.ABI.makeIWebUIBackgroundTaskInstance(ref.value))
  }

  private fun as_1930790727(): IBackgroundTaskInstance.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskInstance.ABI.makeIBackgroundTaskInstance(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskInstance>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskInstance.ABI.makeIBackgroundTaskInstance(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUIBackgroundTaskInstanceRuntimeClass> {
    public override fun getValue() = WebUIBackgroundTaskInstanceRuntimeClass(pointer.getPointer(0))

    public fun setValue(value: WebUIBackgroundTaskInstanceRuntimeClass): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIBackgroundTaskInstanceRuntimeClass, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebUIBackgroundTaskInstanceRuntimeClass {
      val address = segment.toRawLongValue()
      return WebUIBackgroundTaskInstanceRuntimeClass(Pointer(address))
    }

    public override fun toNative(obj: WebUIBackgroundTaskInstanceRuntimeClass): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
