package Windows.Graphics.Printing

import Windows.Foundation.Rect
import Windows.Foundation.Size
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.platform.win32.WinDef
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.jvm.JvmField

@ABIMarker(PrintPageDescription.ABI::class)
@Signature("struct(Windows.Graphics.Printing.PrintPageDescription;struct(Windows.Foundation.Size;f4;f4);struct(Windows.Foundation.Rect;f4;f4;f4;f4);u4;u4)")
@Structure.FieldOrder("PageSize, ImageableRect, DpiX, DpiY")
@WinRTByReference(brClass = PrintPageDescription.ByReference::class)
public open class PrintPageDescription(
  ptr: Pointer? = Pointer.NULL
) : Structure(ptr) {
  @JvmField
  public var PageSize: Size? = null

  @JvmField
  public var ImageableRect: Rect? = null

  @JvmField
  public var DpiX: WinDef.UINT? = null

  @JvmField
  public var DpiY: WinDef.UINT? = null

  public class ByReference : PrintPageDescription(), Structure.ByReference,
      IByReference<PrintPageDescription> {
    public override fun getValue(): PrintPageDescription = this
  }

  public class ByValue(
    ptr: Pointer? = Pointer.NULL
  ) : PrintPageDescription(ptr), Structure.ByValue

  public object ABI : IABI<ByValue, MemorySegment> {
    public val fromNativeHandle: MethodHandle =
        MethodHandles.lookup().findStatic(PrintPageDescription::class.java, "fromNative",
        MethodType.methodType(ByValue::class.java, MemorySegment::class.java))


    public override val layout: GroupLayout = MemoryLayout.structLayout(
      Size.ABI.layout, 
      Rect.ABI.layout, 
      JAVA_INT, 
      JAVA_INT, 
    )


    public override fun fromNative(segment: MemorySegment): ByValue {
      val address = segment.address().toRawLongValue()
      return ByValue(Pointer(address))
    }

    public override fun toNative(obj: ByValue): MemorySegment {
      obj.write()
      val address  = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
      return MemorySegment.ofAddress(address, layout.byteSize(), MemorySession.global())
    }
  }
}
