package Windows.Graphics.Imaging

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

@ABIMarker(BitmapProperties.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapProperties;{ea9f4f1b-b505-4450-a4d1-e8ca94529d8d})")
@WinRTByReference(brClass = BitmapProperties.ByReference::class)
public class BitmapProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapProperties.WithDefault, IBitmapPropertiesView.WithDefault, IWinRTObject
    {
  private val __454422773_Interface: IBitmapProperties.WithDefault by lazy {
    as_454422773()
  }


  private val __873349200_Interface: IBitmapPropertiesView.WithDefault by lazy {
    as_873349200()
  }


  public override val __454422773_Ptr: JNAPointer? by lazy {
    __454422773_Interface.__454422773_Ptr
  }


  public override val __873349200_Ptr: JNAPointer? by lazy {
    __873349200_Interface.__873349200_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__454422773_Interface, __873349200_Interface)

  private fun as_454422773(): IBitmapProperties.WithDefault {
    if(pointer == NULL) {
      return(IBitmapProperties.ABI.makeIBitmapProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapProperties.ABI.makeIBitmapProperties(ref.value))
  }

  private fun as_873349200(): IBitmapPropertiesView.WithDefault {
    if(pointer == NULL) {
      return(IBitmapPropertiesView.ABI.makeIBitmapPropertiesView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapPropertiesView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapPropertiesView.ABI.makeIBitmapPropertiesView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BitmapProperties> {
    public override fun getValue() = BitmapProperties(pointer.getPointer(0))

    public fun setValue(value: BitmapProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BitmapProperties {
      val address = segment.toRawLongValue()
      return BitmapProperties(Pointer(address))
    }

    public override fun toNative(obj: BitmapProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
